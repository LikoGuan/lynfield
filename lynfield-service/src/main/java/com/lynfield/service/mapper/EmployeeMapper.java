package com.lynfield.service.mapper;

import com.lynfield.common.model.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by likoguan on 4/11/17.
 */
@Repository
@Mapper
public interface EmployeeMapper {
    @Insert("INSERT INTO employee(id, name, sex, birth_date, nationality, phone, email, postal_address, create_time, " +
            "modify_time) VALUE(#{id}, #{name}, #{sex}, #{birthDate}, #{nationality}, #{phone}, #{email}, " +
            "#{postalAddress}, #{createTime}, #{modifyTime})")
    int insert(Employee employee);

    @Select("SELECT id, name, sex, birth_date AS birthDate, nationality, phone, email, postal_address AS postalAddress, " +
            "create_time AS createTime, modify_time AS modifyTime FROM employee")
    List<Employee> findAll();
}