package curso.curso.Account;

public class KidsSavingAccount extends Account {

	public KidsSavingAccount(String usuario, String cuenta, String type, double balanceAccount) {
		super(usuario, cuenta, type, balanceAccount);
	}

	@Override
	public void executeAccount(double valueTransaction) {
		super.setBalanceAccount(super.getBalanceAccount() - valueTransaction);
	}

}
