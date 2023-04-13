package com.luv2code.springboot.cruddemo.rest;

import java.util.*;

import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api")
public class EmployeeRestController {

    private EmployeeService employeeService;
//    quick and dirty: inject employee dao

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


//    expose "/employee" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll()
    {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee findById(@PathVariable int employeeId)
    {
        Employee theEmployee =  employeeService.findById(employeeId);

        if(theEmployee == null) {
            throw new RuntimeException("Employee Id Not Found - " + employeeId);
        }

        return theEmployee;
    }

    // add mapping for POST / employees - add new employees

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee)
    {
        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update
        theEmployee.setId(0);

        return employeeService.save(theEmployee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee)
    {
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }

    @DeleteMapping("/employees/{id}")
    public String removeById(@PathVariable int id)
    {
        Employee dbEmployee = employeeService.findById(id);

        if(dbEmployee == null) {
            throw new RuntimeException("Employee Id Not Found - " + id);
        }

        employeeService.deleteById(id);

        return "Deleted employee with id " + id;
    }

}
