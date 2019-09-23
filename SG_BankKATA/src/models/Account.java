package models;

import java.io.PrintStream;
import java.util.Date;

public class Account {

	private Statement statement;

	private Amount balance = Amount.amountOf(0);

	public Account(Statement statement) {
		this.statement = statement;
	}

	public void deposit(Amount value, Date date) {
		doOperation(value, date);
	}

	public void withdrawal(Amount value, Date date) {
		doOperation(value.negative(), date);
	}

	public void printStatement(PrintStream printer) {
		statement.printTo(printer);
	}

	private void doOperation(Amount value, Date date) {
		Transaction transaction = new Transaction(value, date);
		Amount balanceAfterTransaction = transaction.balanceAfterTransaction(balance);
		balance = balanceAfterTransaction;
		statement.addLineContaining(transaction, balanceAfterTransaction);
	}
}
