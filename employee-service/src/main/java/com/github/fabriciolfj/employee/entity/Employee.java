package com.github.fabriciolfj.employee.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Long id;
    @NotNull
    private Long organizationId;
    @NotNull
    private Long departmentId;
    @NotBlank
    private String name;
    @Min(1)
    @Max(100)
    private int age;
    @NotBlank
    private String position;
}
