package com.example.mapper;

import com.example.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DeptMapper {
    Dept getDeptById(Integer id);

    Dept getDeptAndEmployees(Integer id);

    Dept getDeptEmployeesStep(Integer id);

    List<Map<String, Object>> getList();
}




