package com.kittipong.assignment.springboot.restful.controller;

import com.kittipong.assignment.springboot.restful.model.Employee;
import com.kittipong.assignment.springboot.restful.dto.EmployeeDTO;
import com.kittipong.assignment.springboot.restful.mapper.EmployeeMapper;
import lombok.extern.slf4j.Slf4j;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import java.util.List;
import java.util.Optional;



@Slf4j
@RequiredArgsConstructor


@RestController
@RequestMapping("/Employees")
public class EmployeeController {
    private  final com.kittipong.assignment.springboot.restful.service.EmployeeService EmployeeService;
    private  final EmployeeMapper EmployeeMapper;

    @PostMapping
    public ResponseEntity<EmployeeDTO> create(@RequestBody EmployeeDTO EmployeeDTO) {
        EmployeeService.save(EmployeeMapper.toEmployee(EmployeeDTO));

        return ResponseEntity.status(HttpStatus.CREATED).body(EmployeeDTO);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> findAll() {
        return ResponseEntity.ok(EmployeeMapper.toEmployeeDTOs(EmployeeService.findAll()));
    }



    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> findById(@PathVariable String id) {
        Optional<Employee> Employee = EmployeeService.findById(id);

        return ResponseEntity.ok(EmployeeMapper.toEmployeeDTO(Employee.get()));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDTO> update(@PathVariable String id, @RequestBody EmployeeDTO EmployeeDTO) {
        Employee Employee = EmployeeMapper.toEmployee(EmployeeDTO);
        Employee.setId(id);

        EmployeeService.save(Employee);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(EmployeeDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        EmployeeService.deleteById(id);

        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
