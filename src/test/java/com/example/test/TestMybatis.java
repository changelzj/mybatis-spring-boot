package com.example.test;

import com.example.Application;
import com.example.entity.UserEntity;
import com.example.entity.UserEntityExample;
import com.example.mapper.DeptEntityMapper;
import com.example.mapper.EmployeeEntityMapper;
import com.example.mapper.StudentEntityMapper;
import com.example.mapper.UserEntityMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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
    
    @Test
    public void queryPage() {
        UserEntityExample example = new UserEntityExample();
        Page<Object> page = PageHelper.startPage(1, 2);
        List<UserEntity> userEntities = userEntityMapper.selectByExample(example);
        PageInfo<UserEntity> pageInfo = new PageInfo<>(userEntities);
        System.out.println(pageInfo.isHasNextPage());
        System.out.println(pageInfo.getTotal());
        System.out.println(pageInfo.isIsFirstPage());
        pageInfo.getList().forEach(e -> System.out.println(e.getName()));
    }
}
