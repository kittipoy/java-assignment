package com.kittipong.assignment.springboot.restful.respository;

import com.kittipong.assignment.springboot.restful.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository<Employee, String> {
}
