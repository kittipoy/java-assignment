package com.kittipong.assignment.springboot.restful.service;

import com.kittipong.assignment.springboot.restful.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor

@Service
public class EmployeeService {
    private  final com.kittipong.assignment.springboot.restful.respository.EmployeeRespository EmployeeRespository;

    public List<Employee> findAll() {
        return EmployeeRespository.findAll();
    }

    public Optional<Employee> findById(String id) {
        return EmployeeRespository.findById(id);
    }

    public Employee save(Employee employee) {
        return EmployeeRespository.save(employee);
    }

    public void deleteById(String id) {
        EmployeeRespository.deleteById(id);
    }
}




