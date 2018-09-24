package curso.curso.Account;

public abstract class Account {

	private String user;
	private String accountNumber;
	private String type;
	private double balanceAccount;

	public Account(String user, String accountNumber, String type, double balanceAccount) {
		this.user = user;
		this.accountNumber = accountNumber;
		this.type = type;
		this.balanceAccount = balanceAccount;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalanceAccount() {
		return balanceAccount;
	}

	public void setBalanceAccount(double balanceAccount) {
		this.balanceAccount = balanceAccount;
	}

	public abstract void executeAccount(double valueTransaction);

}
