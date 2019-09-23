import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import models.Account;
import models.Amount;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Account account = new Account(new Statement());

		Account compte = new Account(new models.Statement());

		//compte.deposit(Amount.amountOf(1), new Date("23/09/2019"));
		compte.deposit(Amount.amountOf(2), new Date("23/09/2019"));
		compte.withdrawal(Amount.amountOf(5), new Date("23/09/2019"));

		compte.printStatement(System.out);

	}

}
