package com.christopher.serviceconsumingwithreact.Database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.christopher.serviceconsumingwithreact.Entity.Employee;
import com.christopher.serviceconsumingwithreact.Repository.EmployeeRepository;

@Component
public class DataBaseLoader implements CommandLineRunner{


    private final EmployeeRepository repository;

	@Autowired
	public DataBaseLoader(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
	}
}
