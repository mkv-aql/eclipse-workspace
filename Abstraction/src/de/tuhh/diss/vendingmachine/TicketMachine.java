/**
 * 
 */
package de.tuhh.diss.vendingmachine;

import de.tuhh.diss.io.SimpleIO;

/**
 * @author Makav
 *
 */
public class TicketMachine {
	private int ticketPrice;
	private int balance;
	private int revenue;
	
	public TicketMachine(int ticketPrice) {
		this.ticketPrice = ticketPrice;
		balance = 0;
		revenue = 0;
	}
	
	public int getTicketPrice() {
		
		return ticketPrice;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void insertMoney(int amount) {
		if (amount > 0) {
			this.balance += amount;
		}	
	}
	
	public void printTicket() {
		if (balance >= ticketPrice) {
			revenue += ticketPrice;
			balance -= ticketPrice;
			SimpleIO.println("Ticket Printed!");
		} else
			SimpleIO.println("Not enough balance!");
			SimpleIO.println("missing amount: " +(ticketPrice - balance));
	}
	
	public int refundBalance() {
		int refundAmount = balance;
		balance = 0;
		return refundAmount;
	}
}
