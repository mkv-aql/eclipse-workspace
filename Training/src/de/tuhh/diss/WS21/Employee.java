package de.tuhh.diss.WS21;

//Object Employee is not possible, therefore it is an abstract
public abstract class Employee {
    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public void pay() {
        // Trigger the payment process
        double salary = calculateSalary();
        // Continue with the payment process...
    }

    public abstract double calculateSalary();
}
