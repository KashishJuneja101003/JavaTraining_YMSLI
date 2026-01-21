package Assignment_3_Q3;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String name;
	private Address address;
	transient double salary;

	public Employee(int id, String name, Address address, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public void display() {
		System.out.println("Employee [id=" + id + ", name=" + name + ", " + address + "]");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
