package com.github.fabriciolfj.department.client;

import com.github.fabriciolfj.department.model.Employee;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Singleton
@Path("/employees")
@RegisterRestClient
public interface EmployeeClient {

    @GET
    @Path("/department/{departmentId}")
    @Produces(MediaType.APPLICATION_JSON)
    List<Employee> findByDepartment(@PathParam("departmentId") Long departmentId);
}
