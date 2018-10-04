public class BankAccount{
	private double balance;
	private int accountID;
	private String password;

	public BankAccount(double newBalance, int newID, String newPass){
		balance = newBalance;
		accountID = newID;
		password = newPass;
	}
	public String toString() {
		return accountID + "\t" + balance;
	}
	public void setPassword(String newPass) {
		password = newPass;
	}

	public boolean deposit(double amount) {
		if (amount >= 0){
			balance += amount;
			return true;
		}
		else {return false;}
	}
	public boolean withdraw(double amount) {
		if (amount > balance || amount < 0) return false;
		else {
			balance -= amount;
			return true;
		}
	}
	public double getBalance() {
		return balance;
	}
	public int getID() {
		return accountID;
	}
}
