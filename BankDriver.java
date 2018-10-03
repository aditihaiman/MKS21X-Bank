public class BankDriver{
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(10000, 242225217, "abadpassword");

		System.out.println(myAccount.getBalance());  //returns: 10000.0
		System.out.println(myAccount.getPassword()); //returns: abadpassword
		System.out.println(myAccount.getID()); //returns: 242225217
		myAccount.deposit(499);
		System.out.println(myAccount.getBalance()); //returns: 10499.0
		myAccount.withdraw(4319);
		System.out.println(myAccount.getBalance()); //returns: 6180.0

	}


}
