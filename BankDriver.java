public class BankDriver{
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(10000, 242225217, "abadpassword");

		System.out.println(myAccount.getBalance());
		System.out.println(myAccount.getPassword());
		System.out.println(myAccount.getID());
		myAccount.deposit(499);
		System.out.println(myAccount.getBalance());
		myAccount.withdraw(4319);
		System.out.println(myAccount.getBalance());

	}


}
