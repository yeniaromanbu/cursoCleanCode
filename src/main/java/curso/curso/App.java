package curso.curso;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import curso.curso.Account.Account;
import curso.curso.Account.CheckingAccount;
import curso.curso.Account.KidsSavingAccount;
import curso.curso.Account.SavingAccount;
import curso.curso.Transaction.Transaction;
import curso.curso.Transaction.Transfer;

/**
 * Hello world!
 *
 */
public class App {

	public static ArrayList<Account> accountList = new ArrayList<Account>();

	public static void main(String[] args) {

		CheckingAccount checkingAccount = new CheckingAccount("user01", "465421654216", "CheckingAccount", 3000);
		KidsSavingAccount kidsSavingAccount = new KidsSavingAccount("user02", "000054421540", "KidsSavingAccount",
				4000);
		SavingAccount savingAccount = new SavingAccount("user03", "4845324105645", "SavingAccount", 80000);

		accountList.add(checkingAccount);
		accountList.add(kidsSavingAccount);
		accountList.add(savingAccount);

		Transaction transfer = new Transfer();
		for (Account accountType : accountList) {
			System.out.println("Account Number: " + accountType.getAccountNumber());
			System.out.println("Account Type: " + accountType.getType());
			System.out.println("Current Balance: " + accountType.getBalanceAccount());
			System.out.println("Transfer Value: " + 200);
			System.out.println("transfering....................................");
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
			System.out.println("Transaction Date: " + formatter.format(transfer.getTransactionDate()));
			transfer.executeTransaction(accountType, 200);
			System.out.println("Current Balance: " + accountType.getBalanceAccount() + "\n");
		}

	}
}
