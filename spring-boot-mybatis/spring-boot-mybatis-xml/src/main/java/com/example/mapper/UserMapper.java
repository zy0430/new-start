package com.example.mapper;

import java.util.List;

import com.example.model.User;

public interface UserMapper {

    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);

}