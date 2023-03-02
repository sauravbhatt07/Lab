package March2lab;
public class MainCustomer { //main class
	public static void main(String[] args) {
		Customer co = new Customer(); //create object
		co.setAccountName("James");
		co.setAccountNumber(123456789000L);
		co.setAccountBalance(40000);
		co.setWithdraw(2000);
		System.out.println("Account Holder name is :"+co.getAccountName());
		System.out.println("Account number is :"+co.getAccountNumber());
		System.out.println("Withdraw Amount is :"+co.getWithdraw());
		System.out.println("Account Balance is :"+co.getAccountBalance());
		System.out.println(); // for space
		co.setAccountName("Boomer"); // another customer details
		co.setAccountNumber(987654321000L);
		co.setAccountBalance(23400);
		co.setWithdraw(10000);;
		System.out.println("Account Holder name is :"+co.getAccountName());
		System.out.println("Account number is :"+co.getAccountNumber());
		System.out.println("Withdraw Amount is :"+co.getWithdraw());
		System.out.println("Account Balance is :"+co.getAccountBalance());
	}}
		
	