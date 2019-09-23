package models;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class Statement {

	private static final int TOP_OF_THE_LIST = 0;

	public static final String STATEMENT_HEADER = "date       | credit   | debit    | balance";

	private List<Enregistrement> statementLines = new LinkedList<Enregistrement>();

	public void addLineContaining(Transaction transaction, Amount currentBalance) {
		statementLines.add(TOP_OF_THE_LIST, new Enregistrement(transaction, currentBalance));
	}

	public void printTo(PrintStream printer) {
		printer.println(STATEMENT_HEADER);
		printStatementLines(printer);
	}

	private void printStatementLines(PrintStream printer) {
		for (Enregistrement statementLine : statementLines) {
			statementLine.printTo(printer);
		}
	}
}
