package curso.curso.Account;

import java.util.List;

public class SavingAccount extends Account {

	private static final double CUOTA_MANEJO = 2000;
	private int numberTransaction = 1;
	

	public SavingAccount(String user, String numberAccount, String type, double balanceAccount) {
		super(user, numberAccount, type, balanceAccount);

	}

	@Override
	public void executeAccount(double valueTransaction) {
		// TODO Auto-generated method stub
		if (numberTransaction >= 3) {
			super.setBalanceAccount(super.getBalanceAccount() - (valueTransaction * 0.05));
		} else {
			super.setBalanceAccount(super.getBalanceAccount() - valueTransaction);
		}
		numberTransaction++;

	}

	
}
