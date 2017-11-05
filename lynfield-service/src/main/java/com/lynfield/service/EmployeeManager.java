package com.lynfield.service;

import com.lynfield.common.model.Employee;

import java.util.List;

/**
 * Created by likoguan on 4/11/17.
 */
public interface EmployeeManager {
    Boolean addEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
