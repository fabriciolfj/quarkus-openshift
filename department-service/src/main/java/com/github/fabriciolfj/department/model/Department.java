package com.github.fabriciolfj.department.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private Long id;
    private String name;
    private List<Employee> employees;
}
