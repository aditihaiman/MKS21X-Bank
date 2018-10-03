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
	public boolean deposit(double amount) {
		if (amount >= 0){			
			balance += amount;
			return true;
		}
		else {return false;}
	}
	public boolean withdraw(double amount) {
		if (amount > balance) return false;
		else {
			balance -= amount;
			return true;
		}
	}
	public String getPassword(BankAccount acc) {
		return password;
	}
	public String getBalance(BankAccount acc) {
		return balance;
	}
	public String getID(BankAccount acc) {
		return accountID;
	}
}
