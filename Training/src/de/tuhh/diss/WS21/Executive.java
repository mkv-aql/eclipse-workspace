package de.tuhh.diss.WS21;

public class Executive extends Employee {
    private double performanceScore;

    public Executive(String name, int yearOfBirth) {
        super(name, yearOfBirth);
        this.performanceScore = 0;
    }

    public void setPerformanceScore(double performanceScore) {
        this.performanceScore = performanceScore;
    }

    @Override
    public double calculateSalary() {
        // Calculate salary based on performance score
        // This is just a placeholder. Replace with actual calculation.
        return performanceScore * 1000;
    }
}
