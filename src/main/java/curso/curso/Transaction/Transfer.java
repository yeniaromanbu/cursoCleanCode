package curso.curso.Transaction;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import curso.curso.Account.Account;

public class Transfer implements Transaction {

	public void executeTransaction(Account account, double valueTransaction) {
		account.executeAccount(valueTransaction);
	}

	public Date getTransactionDate() {
		return new Date();
	}

	public List<Transaction> getBalanceState() {
		// TODO Auto-generated method stub
		return new ArrayList<Transaction>();
	}

}
