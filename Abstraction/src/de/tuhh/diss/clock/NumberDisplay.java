/**
 * 
 */
package de.tuhh.diss.clock;

import java.util.Locale; //For converting floats to strings

/**
 * @author Makav
 *
 */
public class NumberDisplay {
	private int range;
	private int value;
	
	public NumberDisplay(int range) {
		this.range = range;
		value = 0;
	}
	
	//The received values will be converted to string
	/*
	public String getDisplayString() {
		String stringValue = String.format(Locale.ROOT,"%.02f", value);
		return stringValue; 
	}
	*/
	
	//Simpler way of displaying strings
	public String getDisplayString() {
		if (value < 10) {
			return ("0" +value);
		} else
			return ("" +value);
	}
	
	public void setValue(int newValue) {
		if ((newValue > 0) && (newValue < range)) {
			this.value = newValue;
		}
	}
	
	public int getValue() {
		return value;
	}
	
	public void increment() {
		value = (value + 1) % range;
	}
}
