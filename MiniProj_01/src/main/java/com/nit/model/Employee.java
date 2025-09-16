package com.nit.model;

import org.springframework.boot.convert.DataSizeUnit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data

public class Employee {

	private Integer eNo;
	private String eName;
	private String job;
	private Double salary;
	private Integer depto;
	private Double grossSalary;
	private Double netSalary;

}
