package models;

import java.io.PrintStream;

public class Enregistrement {

	private Transaction transaction;
	private Amount currentBalance;

	public Enregistrement(Transaction transaction, Amount currentBalance) {
		this.transaction = transaction;
		this.currentBalance = currentBalance;
	}

	public void printTo(PrintStream printer) {
		this.transaction.printTo(printer, currentBalance);
	}

}
