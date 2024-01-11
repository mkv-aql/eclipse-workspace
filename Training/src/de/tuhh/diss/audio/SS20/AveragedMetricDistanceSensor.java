package de.tuhh.diss.audio.SS20;

//Assignment 7
public class AveragedMetricDistanceSensor extends DistanceSensor {
	
	private static final double inchToMeter = 0.0254;
	private int numAvgSamples;
	
	//.....
	
	
	//Assignment 7a
	public AveragedMetricDistanceSensor(String unit, int numAvgSamples) {
		super(unit);
		
		//Assignment 7c
		if (numAvgSamples <= 0) {
			throw new IllegalArgumentException("No negative or 0 input");
		}
		
		this.numAvgSamples = numAvgSamples;
		
		
		
	}
	
	//Assignment 7b
	public double takeSample() {
		double sum = 0;
		double result = 0;
		for(int i = 0; i < this.numAvgSamples; i++) {
            sum += super.takeSample();
        }
		
		result = (sum/this.numAvgSamples)*inchToMeter;
        return result;
	}

}
