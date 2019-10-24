package com.example.mapper;

import com.example.entity.EmployeeEntity;
import com.example.entity.EmployeeEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeEntityMapper {
    long countByExample(EmployeeEntityExample example);

    int deleteByExample(EmployeeEntityExample example);

    int deleteByPrimaryKey(Integer employeeId);

    int insert(EmployeeEntity record);

    int insertSelective(EmployeeEntity record);

    List<EmployeeEntity> selectByExample(EmployeeEntityExample example);

    EmployeeEntity selectByPrimaryKey(Integer employeeId);

    int updateByExampleSelective(@Param("record") EmployeeEntity record, @Param("example") EmployeeEntityExample example);

    int updateByExample(@Param("record") EmployeeEntity record, @Param("example") EmployeeEntityExample example);

    int updateByPrimaryKeySelective(EmployeeEntity record);

    int updateByPrimaryKey(EmployeeEntity record);
}