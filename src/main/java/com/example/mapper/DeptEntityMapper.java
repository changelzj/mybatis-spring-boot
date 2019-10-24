package com.example.mapper;

import com.example.entity.DeptEntity;
import com.example.entity.DeptEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptEntityMapper {
    long countByExample(DeptEntityExample example);

    int deleteByExample(DeptEntityExample example);

    int deleteByPrimaryKey(Integer departmentId);

    int insert(DeptEntity record);

    int insertSelective(DeptEntity record);

    List<DeptEntity> selectByExample(DeptEntityExample example);

    DeptEntity selectByPrimaryKey(Integer departmentId);

    int updateByExampleSelective(@Param("record") DeptEntity record, @Param("example") DeptEntityExample example);

    int updateByExample(@Param("record") DeptEntity record, @Param("example") DeptEntityExample example);

    int updateByPrimaryKeySelective(DeptEntity record);

    int updateByPrimaryKey(DeptEntity record);
}