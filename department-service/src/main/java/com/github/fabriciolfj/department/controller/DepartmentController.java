package com.github.fabriciolfj.department.controller;

import com.github.fabriciolfj.department.client.EmployeeClient;
import com.github.fabriciolfj.department.model.Department;
import com.github.fabriciolfj.department.repository.DepartmentRepository;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/departments")
@Produces(MediaType.APPLICATION_JSON)
public class DepartmentController {

    @Inject
    private DepartmentRepository departmentRepository;
    @Inject
    @RestClient
    private EmployeeClient client;


    @GET
    @Path("/{departmentId}")
    public Department get(@PathParam("departmentId") Long id) {
        var department = departmentRepository.findById(id);
        department.setEmployees(client.findByDepartment(id));
        return department;
    }
}
