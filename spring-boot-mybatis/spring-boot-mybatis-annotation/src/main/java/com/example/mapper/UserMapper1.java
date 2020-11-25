package com.example.mapper;

import com.example.enums.UserSexEnum;
import com.example.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper1 {
        @Select("select * from user")
        @Results({
            @Result(property = "userSex", column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
        })
        List<User> getAll();


        @Select("SELECT * FROM user WHERE id =  #{id}")
        @Results({
            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
        })
        User getOne(Long id);

        @Insert("insert into user(userName,passWord,user_sex) values(#{userName}, #{passWord}, #{userSex})")
        void insertUser(User user);

        @Update("update user set userName=#{userName}, nick_name=#{nickName} where id = #{id}")
        void updateUser(User user);

        @Delete("delete from user where id = #{id}")
        void deleteUser(Long id);

}
