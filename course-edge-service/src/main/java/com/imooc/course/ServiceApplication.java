package com.imooc.course;

import com.imooc.course.filter.CourseFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nnkwrik
 * 18/08/28 22:02
 */
@SpringBootApplication
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);

    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(CourseFilter courseFilter){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(courseFilter);
        List<String> userPatterns = new ArrayList<>();
        userPatterns.add("/*");
        filterRegistrationBean.setUrlPatterns(userPatterns);

        return filterRegistrationBean;
    }
}
