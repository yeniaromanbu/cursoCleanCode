package curso.curso.Transaction;

import java.util.Date;

import curso.curso.Account.Account;

public interface Transaction {

	public void executeTransaction(Account account, double valueTransaction);

	public Date getTransactionDate();

}
