package com.training.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.training.entities.Address;
import com.training.entities.Department;
import com.training.entities.Employee;
import com.training.entities.Project;

@Configuration


public class Config {
	
	@Bean(name = "address")
	public Address address() {
		return new Address("bldgName", "data");
		
	}

	
	@Bean(name="department")
	public Department department() {
		return new Department(10, "IT");
		
			}
   
	@Bean(name="projects")
	@Scope(value = "prototype")
	public List<Project> projects(){
		List<Project> list =new ArrayList();
		
		Project p1 = new Project(190,"Abacus");
		Project p2=new Project(343,"Ultra Thin Ipad with M4");
		
		
		list.add(p1);
		list.add(p2);
		
		return list;
		
		
		
	}
	
	@Bean(name = "emp1")
	public Employee employee() {
		
		return new Employee();
		
	}
}
