import java.util.Scanner;
class Bank2{
    String name;
    String cnic;
    long accountNumber;
    String password;
    int amount;
    int balance=0;
   Scanner sc=new Scanner(System.in);
   
   public void createAccount(){
	   System.out.print("Enter your name: ");
	    name=sc.next();
	   System.out.print("Enter your CNIC Number: ");
	    cnic=sc.next();
	   System.out.print("Enter your 4 digit Password: ");
	    password=sc.next();
	   System.out.println("\t\t\tYour Account is Succcessfully Created. ");
   }
   
      public void login(){
	   System.out.print("Enter  username: ");
	   String name1=sc.next();
	   System.out.print("Enter user CNIC Number: ");
	   String cnic1=sc.next();
	   System.out.print("Enter your 4 digit Password: ");
	   String password1=sc.next();
	   if(name.equals(name1) && cnic.equals(cnic1) && password.equals(password1)){
	   System.out.println("\t\t\tLogged in Succcessfully. ");
	   }
	   else {
		   System.out.println("Invalid username , password or CNIC. Please try again.");
	   }
	  }
	  
   public void deposit(long accountNumber,int amount){
      balance=balance+amount;
	  System.out.println("\t\t\tCash deposit Succcessfully!");
   }
   
   public void manu1(Bank2 obj){
	    Scanner sc=new Scanner(System.in);
		 boolean check=true;
		 boolean firstMethodExuted=false;
	   while(check){
			 System.out.println("1:Create Account\n2:Login");
		      System.out.print(" enter Your Choice:  ");
	          int choice=sc.nextInt();
		 switch(choice){
			 case 1:
			 obj.createAccount();
			 firstMethodExuted=true;
			 break;
			 case 2: 
			 if(firstMethodExuted){
			 obj.login();
			 check=false;
			 }
			 else{
				 System.out.println("\t\t\tCreate Account First: ");
				 choice=0;
			 }
				   break;
			 default: 
			 System.out.print("Invalid input");
		 } 
	 }
	   
   }
   
  public void manu2( Bank2 obj){
	  boolean ch=true;
	   while (ch){
		   System.out.println("1:Deposit Amount\n2:display Information\n3:Exit");
		 System.out.print("Enter your choice: ");
         int choice2 = sc.nextInt();
            switch (choice2) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                     amount = sc.nextInt();
					 System.out.print("Enter the Account Number: ");
                       accountNumber = sc.nextLong();
                    obj.deposit(accountNumber,amount);
                    break;
                case 2:
                    obj.display();
                    break;
                case 3:
                    System.out.println("Exit program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
		 } 
	   }
   public void display(){
	   System.out.println("\t\t\t_____INFORMATION_______");
	   System.out.println("\t\t\tCASH DEPOSIT MACHINE ");
	   System.out.println("\t\t\tUser Name:  "+name);
	   System.out.println("\t\t\tUser Cnic:  "+cnic);
	   System.out.println("\t\t\tUser Password:  "+password);
	   System.out.println("\t\t\tUser Account Number:  "+accountNumber);
	   System.out.println("\t\t\tBalance:  "+balance);
	   System.out.println("\t\t\t_______________________");
   }
 
     public static void main(String args[]){
		 Bank2 obj=new Bank2();
		 System.out.println("WELCOME TO CASH DEPOSIT MACHINE ");
		 obj.manu1(obj);
		 obj.manu2(obj);
	 }
}