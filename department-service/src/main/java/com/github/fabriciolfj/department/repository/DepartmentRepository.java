package com.github.fabriciolfj.department.repository;


import com.github.fabriciolfj.department.model.Department;

import javax.enterprise.context.ApplicationScoped;
import java.util.*;

@ApplicationScoped
public class DepartmentRepository {

    private Set<Department> departments = new HashSet<>();

    public DepartmentRepository() {
        add(new Department(1L, "Test1", Collections.emptyList()));
        add(new Department(1L, "Test2",  Collections.emptyList()));
        add(new Department(2L, "Test3",  Collections.emptyList()));
    }

    public Department add(Department department) {
        department.setId((long) (departments.size() + 1));
        departments.add(department);
        return department;
    }

    public Department findById(Long id) {
        Optional<Department> department = departments.stream().filter(a -> a.getId().equals(id)).findFirst();
        if (department.isPresent())
            return department.get();
        else
            return null;
    }

    public Set<Department> findAll() {
        return departments;
    }

}
