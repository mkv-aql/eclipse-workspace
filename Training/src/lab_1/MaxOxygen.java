package lab_1;

public class MaxOxygen {
	
	private int age;
	private double VO2_max;
	
	//Constructor
	public MaxOxygen(int age){
		this.age = age;
		this.VO2_max = VO2_calculation();
		
	}
	
	public double getVO2_max() {
		return this.VO2_max;
	}
	
	public double VO2_calculation() {
		double vo2_max_calculation = (HRMaxCalculation() / HRRestDecision()) * 15;
		
		return vo2_max_calculation;
	}
	
	public int HRRestDecision() {
		
		int HR_rest_decision = 0;
		if (this.age > 18 && this.age < 35) {
			HR_rest_decision = 71;
		}
		else if(this.age > 36 && this.age < 55) {
			HR_rest_decision = 73;
		}
		else {
			HR_rest_decision = 76;
		}
		
		return HR_rest_decision;
	}
	
	public double HRMaxCalculation() {
		double HR_max_calculation = 206.9 - (0.67 * this.age);
		
		return HR_max_calculation;
	}
	

	
}
