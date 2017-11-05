package com.lynfield.service;

import com.lynfield.common.model.Employee;
import com.lynfield.service.mapper.EmployeeMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by likoguan on 4/11/17.
 */
@Component("employeeManager")
public class EmployeeManagerImpl implements EmployeeManager{
    private final static Logger logger = LoggerFactory.getLogger(EmployeeManagerImpl.class);

    @Autowired
    private ComputerService computerService;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Boolean addEmployee(Employee employee) {
        logger.debug("addEmployee");
        try {
            return employeeMapper.insert(employee) == 1;
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
        }
        return false;
    }

    @Override
    public List<Employee> getAllEmployees() {
        try {
            return employeeMapper.findAll();
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
        }
        return null;
    }
}
