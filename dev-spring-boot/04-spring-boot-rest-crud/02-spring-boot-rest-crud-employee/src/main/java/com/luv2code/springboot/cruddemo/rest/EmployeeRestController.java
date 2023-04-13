package com.luv2code.springboot.cruddemo.rest;

import java.util.*;

import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class EmployeeRestController {

    private final EmployeeDAO employeeDAO;
//    quick and dirty: inject employee dao

    @Autowired
    public EmployeeRestController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }


//    expose "/employee" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAllData()
    {
        return employeeDAO.findAll();
    }


}
