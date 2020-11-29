package com.example.mapper.test1;

import com.example.enums.UserSexEnum;
import com.example.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface User1Mapper {

    @Results({
            @Result(property = "userSex", column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    @Select("select * from users")
    public List<User> getAll();

    @Results({
            @Result(property = "userSex", column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    @Select("select * from user where id = #{id}")
    User getOne(Long id);


    @Insert("insert into users(userName,passWord,user_sex) values(#{userName}, #{passWord}, #{userSex})")
    void inserUser(User user);

    @Update("update from users set userName=#{userName}, nickName=#{nickName} where id = #{id}")
    void updateUser(User user);

    @Delete("delete from users where id = #{id}")
    void deleteUser(Long id);
}
