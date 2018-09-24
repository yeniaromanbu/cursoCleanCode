package curso.curso.Transaction;

import java.util.Date;

import curso.curso.Account.Account;

public class Withdrawal implements Transaction {

	public void executeTransaction(Account account, double valueTransaction) {
		account.executeAccount(valueTransaction);

	}

	public Date getTransactionDate() {
		return new Date();
	}

	

}
