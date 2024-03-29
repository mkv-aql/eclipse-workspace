/**
 * 
 */
package de.tuhh.diss.clock;

/**
 * @author Makav
 *
 */
public class Clock {
	private NumberDisplay hours; //If a class is used for declaration, then it must be defined below
	private NumberDisplay minutes;
	private String displayString;
	
	//Constructor
	public Clock(int h, int m) {
		this.hours = new NumberDisplay(24);
		this.minutes = new NumberDisplay(60);
		setTime(h, m);
	}
	
	
	public Clock() {
		this(0, 0);
	}
	
	/*
	public Clock(int h, int m) {
		this.hours = new NumberDisplay(h);
		this.minutes = new NumberDisplay(m);
		
	}
	
	//'Clock(NumberDisplay)' needs to be defined
	public Clock(NumberDisplay hours, NumberDisplay minutes) {
		this(hours.getValue(), minutes.getValue());
	}
	*/
	
	public void timeTick() {
		minutes.increment();
		if (minutes.getValue() == 0) {
			hours.increment();
		}
		updateDisplay();
	}
	
	public void setTime(int h, int m) {
		hours.setValue(h);
		minutes.setValue(m);
		updateDisplay();
	}
	
	public String getTime() {
		return displayString;
	}
	
	private void updateDisplay() {
		displayString = hours.getDisplayString() +":" +minutes.getDisplayString();
	}
}
