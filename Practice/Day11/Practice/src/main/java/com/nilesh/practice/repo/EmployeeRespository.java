package com.nilesh.practice.repo;
import java.util.*;
import com.nilesh.practice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRespository extends JpaRepository<Employee,Integer> {



}
