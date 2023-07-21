package com.christopher.serviceconsumingwithreact.Repository;

import org.springframework.data.repository.CrudRepository;

import com.christopher.serviceconsumingwithreact.Entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Long>{

    
}
