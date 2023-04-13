package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.EmployeeRespository;
import com.luv2code.springboot.cruddemo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRespository employeeRespository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRespository employeeRespository) {

        this.employeeRespository = employeeRespository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRespository.findAll();
    }

    @Override
    public Employee findById(int id) {
       Optional<Employee> result = employeeRespository.findById(id);

       Employee employee = null;

       if(result.isPresent())
       {
          employee = result.get();
       }else{
           throw new RuntimeException("Did not find employee id " + id);
       }

       return employee;

    }

    @Override
    public Employee save(Employee employee) {
        return employeeRespository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRespository.deleteById(id);
    }
}
