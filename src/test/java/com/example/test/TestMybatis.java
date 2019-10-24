package com.example.test;

import com.example.Application;
import com.example.entity.UserEntity;
import com.example.mapper.DeptEntityMapper;
import com.example.mapper.EmployeeEntityMapper;
import com.example.mapper.StudentEntityMapper;
import com.example.mapper.UserEntityMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestMybatis {
    
    @Autowired
    private UserEntityMapper userEntityMapper;
    @Autowired
    private EmployeeEntityMapper employeeEntityMapper;
    @Autowired
    private StudentEntityMapper studentEntityMapper;
    @Autowired
    DeptEntityMapper deptEntityMapper;
    
    @Test
    public void query() {
        UserEntity userEntity = userEntityMapper.selectByPrimaryKey(1);
        System.out.println(userEntity.getName());
    }
}
