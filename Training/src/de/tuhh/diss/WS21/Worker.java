package de.tuhh.diss.WS21;

public class Worker extends Employee {
    private int yearsInEmployment;

    public Worker(String name, int yearOfBirth) {
        super(name, yearOfBirth);
        this.yearsInEmployment = 0;
    }

    public void setYearsInEmployment(int yearsInEmployment) {
        this.yearsInEmployment = yearsInEmployment;
    }

    @Override
    public double calculateSalary() {
        // Calculate salary based on years in employment
        // This is just a placeholder. Replace with actual calculation.
        return yearsInEmployment * 500;
    }
}

