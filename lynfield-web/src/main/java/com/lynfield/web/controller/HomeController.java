package com.lynfield.web.controller;

import com.lynfield.common.domain.Computer;
import com.lynfield.common.model.Employee;
import com.lynfield.service.ComputerService;
import com.lynfield.service.EmployeeManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by likoguan on 4/11/17.
 */
@RestController
public class HomeController {
    private final static Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private ComputerService computerService;

    @Autowired
    private EmployeeManager employeeManager;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        Computer computer = computerService.getComputer();

        Employee employee = new Employee();
        employee.setName("liko");
        employee.setSex(1);
        employee.setNationality("China");
        employee.setBirthDate(new Date());
        employee.setCreateTime(new Date());
        employee.setModifyTime(new Date());
        if (employeeManager.addEmployee(employee)) {
            List<Employee> employeeList = employeeManager.getAllEmployees();
            for (Employee e : employeeList) {

            }
        }

        logger.info("log4j in controller is ok");
        return "Welcome to Lynfiled Home, " + computer.toString();
    }
}
