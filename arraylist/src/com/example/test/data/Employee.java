package com.example.test.data;

public class Employee extends Person {

	private long employeeId;
	
	public Employee(long employeeId,String name, int age) {
		super(name, age);
		this.employeeId =employeeId;
	}
	
	public long getEmployeeId() {
		return employeeId;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", getEmployeeId()=" + getEmployeeId() + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee){
			Employee employee = (Employee)obj;
			return this.employeeId == employee.employeeId;
		}
		else return false;
	}
}
