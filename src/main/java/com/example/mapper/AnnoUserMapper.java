package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AnnoUserMapper {

    void add(User user);

    @Select("SELECT `name`, age, sex FROM tb_user")
    List<User> getList();
}
