package com.nilesh.PracticeOne.rest;

import com.nilesh.PracticeOne.equity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository<Employee, Integer> {
}
