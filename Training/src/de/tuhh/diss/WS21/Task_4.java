package de.tuhh.diss.WS21;

public class Task_4 {

	public static void main(String[] args) {
        // Create a new staff manager
        StaffManager staffManager = new StaffManager();

        // Create a new executive and worker
        Executive exec = new Executive("Alice", 1975);
        Worker worker = new Worker("Bob", 1980);

        // Set the performance score for the executive
        exec.setPerformanceScore(0.8);

        // Set the years in employment for the worker
        worker.setYearsInEmployment(5);

        // Add the executive and worker to the staff manager
        staffManager.addEmployee(exec);
        staffManager.addEmployee(worker);

        // Pay all employees
        staffManager.payAllEmployees();
    }

}
