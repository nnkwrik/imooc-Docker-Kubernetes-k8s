package com.imooc.course.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.imooc.course.dto.CourseDTO;
import com.imooc.course.service.ICourseService;
import com.imooc.thrift.user.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by nnkwrik
 * 18/10/16 11:15
 */
@RestController
@RequestMapping("/course")
public class CourseController {


    @Reference(version = "1.0.0",
            application = "${dubbo.application.id}",
            registry = "${dubbo.registry.id}")
    private ICourseService courseService;

    @GetMapping("/courseList")
    public List<CourseDTO> courseList(HttpServletRequest request) {
        UserDTO user = (UserDTO) request.getAttribute("user");
        System.out.println(user.toString());
        return courseService.courseList();
    }
}
