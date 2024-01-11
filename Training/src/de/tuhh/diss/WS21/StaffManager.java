package de.tuhh.diss.WS21;

import java.util.ArrayList;

public class StaffManager {
    //private ArrayList<Employee> employees;
	private Employee[] employees;
	
	/*
    public StaffManager() {
        //this.employees = new ArrayList<>();
    	this.employees = new Employee[]();
    }
    
     public StaffManager(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
    
    */
    
    public StaffManager() {
    	this.employees = new Employee[0];
    }

    public StaffManager(Employee[] employees) {
    	this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        //Code for adding a new single employee into the existing employee array
    }

    public void payAllEmployees() {
        for (Employee employee : employees) {
            employee.pay();
        }
    }
}
