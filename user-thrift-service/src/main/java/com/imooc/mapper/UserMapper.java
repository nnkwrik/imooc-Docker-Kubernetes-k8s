package com.imooc.mapper;

import com.imooc.thrift.user.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by nnkwrik
 * 18/08/28 21:52
 */
@Mapper
public interface UserMapper {

    @Select("select id, username, password, real_name as realName, " +
            "mobile, email from pe_user where id=#{id}")
    UserInfo getUserById(@Param("id") int id);

    @Select("select u.id, u.username, u.password, u.real_name as realName, u.mobile, u.email,t.* " +
            "from pe_user u,pe_teacher t " +
            "where u.id=#{id} and t.user_id=u.id")
    UserInfo getTeacherById(int id);

    @Select("select id, username, password, real_name as realName, " +
            "mobile, email from pe_user where username=#{username}")
    UserInfo getUserByName(@Param("username") String username);

    @Insert("insert into pe_user (username, password, real_name, mobile, email) " +
            "values (#{u.username}, #{u.password}, #{u.realName}, #{u.mobile}, #{u.email})")
    void registerUser(@Param("u") UserInfo userInfo);

}
