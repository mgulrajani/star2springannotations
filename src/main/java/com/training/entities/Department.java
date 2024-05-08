package com.training.entities;

public class Department {
	
	private long id;
	private String name;
	public Department(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	
	public void setup() {
		System.out.println("Department bean initialised");
	}


	public void teardown() {
		System.out.println("Department  bean rendered the service , now getting destroyed ");
	}

	
	
}
