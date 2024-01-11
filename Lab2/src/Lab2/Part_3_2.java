package Lab2;

import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class Part_3_2 {

	public static void main(String[] args) {
		EV3UltrasonicSensor distSens = new EV3UltrasonicSensor(SensorPort.S4);
		SampleProvider dist = distSens.getDistanceMode();
		
		float[] sample;
		sample = new float[dist.sampleSize()];
		dist.fetchSample(sample, 0);
		
		System.out.println(sample[0]);
		
		while(true) {
			dist.fetchSample(sample, 0);
			LCD.clear();
			int i = -1;
			i++;
			LCD.drawString(String.valueOf(sample[i]), 0, 1);
			Delay.msDelay(100);
			
			if (Button.ENTER.isDown()) {
				break;
			}
		}
		


	}

}
