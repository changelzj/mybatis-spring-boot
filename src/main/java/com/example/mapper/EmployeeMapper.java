package com.example.mapper;

import com.example.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    Employee getEmpAndDept(Integer id);

    Employee getEmpAndDeptStep(Integer id);

    Employee getEmployeeByDeptId(Integer id);

    List<Employee> queryList(Employee employee);

    void updateEmployee(Employee employee);
}



