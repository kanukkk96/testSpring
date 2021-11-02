package com.example.testspring.mapper;

import com.example.testspring.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> selectUser() throws Exception;

}
