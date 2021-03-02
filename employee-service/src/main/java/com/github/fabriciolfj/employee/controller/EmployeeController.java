package com.github.fabriciolfj.employee.controller;

import com.github.fabriciolfj.employee.entity.Employee;
import com.github.fabriciolfj.employee.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Slf4j
@Path("/employees")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeController {

    @Inject
    private EmployeeRepository repository;

    @POST
    public Employee add(@Valid Employee employee) {
        log.info("Employee ad: {}", employee);
        return repository.add(employee);
    }

    @Path("/{id}")
    @GET
    public Employee findById(@PathParam("id") Long id) {
        log.info("Employee find: id={}", id);
        return repository.findById(id);
    }

    @GET
    public Set<Employee> findAll() {
        log.info("Employee find");
        return repository.findAll();
    }

    @Path("/department/{departmentId}")
    @GET
    public Set<Employee> findByDepartment(@PathParam("departmentId") Long departmentId) {
        log.info("Employee find: departmentId={}", departmentId);
        return repository.findByDepartment(departmentId);
    }

    @Path("/organization/{organizationId}")
    @GET
    public Set<Employee> findByOrganization(@PathParam("organizationId") Long organizationId) {
        log.info("Employee find: organizationId={}", organizationId);
        return repository.findByOrganization(organizationId);
    }
}
