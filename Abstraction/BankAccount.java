abstract class BankAccount{
		double balance;
		abstract double getBalance();
		abstract double deposit(double amount);
		abstract double withDraw(double amount);
}
