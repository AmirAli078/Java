class Account1 extends BankAccount{
	 double balance;
	   
	   public double deposit(double amount) {
	      balance += amount;
		  return balance;
	   }
	   
	   public double  withDraw(double amount) {
	      balance -= amount;
		  return balance;
	   }
	   
	   public double getBalance() {
	      return balance;
	   }
	   public static void main(String args[]) {
		   Account1 a=new Account1();
		   a.balance=5000;
		   System.out.println(a.balance);
		   //a.deposit(500);
		   System.out.println(a.deposit(500));
	   }



}
