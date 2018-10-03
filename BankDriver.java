public class BankDriver{
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(10000, 242225217, "abadpassword");
		myAccount.deposit(499);
		System.out.println(myAccount);
	}


}
