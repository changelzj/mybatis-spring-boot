package com.example.mapper;

import com.example.entity.StudentEntity;
import com.example.entity.StudentEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentEntityMapper {
    long countByExample(StudentEntityExample example);

    int deleteByExample(StudentEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudentEntity record);

    int insertSelective(StudentEntity record);

    List<StudentEntity> selectByExample(StudentEntityExample example);

    StudentEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudentEntity record, @Param("example") StudentEntityExample example);

    int updateByExample(@Param("record") StudentEntity record, @Param("example") StudentEntityExample example);

    int updateByPrimaryKeySelective(StudentEntity record);

    int updateByPrimaryKey(StudentEntity record);
}