import java.util.Scanner;
class Calculator{
     public void addation(double a, double b){
		 double sum=a+b;
		 System.out.println("Sum: "+sum);
	 }
	      public void subtraction(double a, double b){
		 double sub=a-b;
		 System.out.println("subtraction: "+sub);
	 }
	      public void multiplication(double a, double b){
		 double mul=a*b;
		 System.out.println("Multiplication: "+mul);
	 }
	      public void division(double a, double b){
		 double divide=a+b;
		 System.out.println("Division: "+divide);
	 }
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		char choice='y';
		Calculator c=new Calculator();
		while(choice=='y'){
		System.out.print("enetr the first number , operator and second number:  ");
		int a=sc.nextInt();
		char operator = sc.next().charAt(0);
		int b=sc.nextInt();
		switch(operator)
		{
			case '+': 
		 c.addation(a,b);
		 break;
		    case '-': 
		 c.subtraction(a,b);
		 break;
		    case '*': 
		 c.multiplication(a,b);
		 break;
		 	case '/': 
		 c.division(a,b);
		 break;
		 default: 
		 System.out.println("Invalid input");
		}
		System.out.println("do it again y/n");
		choice = sc.next().charAt(0);
		}
		
		}
	}