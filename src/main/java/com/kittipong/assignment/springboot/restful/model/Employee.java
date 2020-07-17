package com.kittipong.assignment.springboot.restful.model;



import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity

public class Employee {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String telno;
    private String position;
}