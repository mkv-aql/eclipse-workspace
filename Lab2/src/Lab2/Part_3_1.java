package Lab2;
import lejos.hardware.lcd.LCD;
import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;
import lejos.utility.Delay;

public class Part_3_1 {

	public static void main(String[] args) {
		EV3ColorSensor colSens = new EV3ColorSensor(SensorPort.S1);
		SensorMode colorId = colSens.getColorIDMode();
		
		float[] sample;
		sample = new float[colorId.sampleSize()];
		colorId.fetchSample(sample, 0);
		
		Delay.msDelay(500); 
		
		System.out.println(sample[0]);
		//System.out.println(colorId.sampleSize());
		//System.out.println(sample.length);
		
		

	}

}
