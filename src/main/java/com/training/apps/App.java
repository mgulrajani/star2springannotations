package com.training.apps;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.training.config.Config;
import com.training.entities.Address;
import com.training.entities.Department;
import com.training.entities.Employee;
import com.training.entities.Project;

public class App {
	
  public static void main(String[] args) {
	
	  
	  AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
	  
	  Employee e1 = (Employee) context.getBean("emp1");
	  
	  e1.setAddress((Address)context.getBean("address"));
	  
	  e1.setDepartment((Department) context.getBean("department"));
	  
	  e1.setProjects((List<Project>)context.getBean("projects"));
	  
	  
	  System.out.println(e1);
	  
	  
	  
}

}
