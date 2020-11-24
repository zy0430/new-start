package com.example.mapper;

import com.example.enums.UserSexEnum;
import com.example.model.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
        @Select("select * from user")
        @Results({
            @Result(property = "userSex", column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
        })
        List<User> getAll();


        @Select("select * from user where id = {#id}")
        User getOne(Long id);
}
