package curso.curso.Account;

public class CheckingAccount extends Account {

	private static final double QUOTA_MANAGEMENT = 5000;
	private static final double COMMISSION_INTEREST = 0.03;

	public CheckingAccount(String user, String numberAccount, String type, double balanceAccount) {
		super(user, numberAccount, type, balanceAccount);
	}

	@Override
	public void executeAccount(double valueTransaction) {
		super.setBalanceAccount(super.getBalanceAccount() - (valueTransaction * COMMISSION_INTEREST));
	}

}
