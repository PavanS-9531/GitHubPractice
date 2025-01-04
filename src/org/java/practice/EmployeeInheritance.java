package org.java.practice;

class Employee{
	double salary;
	public void employeeSal(double k){
		salary=k;
		System.out.println("Employee salary is : "+ salary);
	}
}

class Manager extends Employee{
	double g=345625.356;
	public void managerSalary() {
		employeeSal(g);
		
		
	}
	
	
}
public class EmployeeInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager();
		m.managerSalary();
	}

}
