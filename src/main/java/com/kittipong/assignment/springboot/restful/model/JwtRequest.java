package com.kittipong.assignment.springboot.restful.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JwtRequest implements Serializable {
	private static final long serialVersionUID = 5926468583005150707L;
	private String username;
	private String password;
}