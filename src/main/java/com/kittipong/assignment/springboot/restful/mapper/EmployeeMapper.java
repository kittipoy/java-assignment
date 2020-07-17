package com.kittipong.assignment.springboot.restful.mapper;
import org.mapstruct.Mapper;
import com.kittipong.assignment.springboot.restful.model.Employee;
import com.kittipong.assignment.springboot.restful.dto.EmployeeDTO;

import java.util.List;
@Mapper
public interface EmployeeMapper {
    EmployeeDTO toEmployeeDTO(Employee Employee);
    List<EmployeeDTO> toEmployeeDTOs(List<Employee> Employees);
    Employee toEmployee(EmployeeDTO EmployeeDTO);
}
