import java.util.Scanner;
class Fraction{
	public void fractionAdd(int a, int b, int c, int d){
	          double addation=(a*d + b*c) / (b*d);
			  System.out.println("Addation: "+addation);
	}
	
   	public void fractionSub(int a, int b, int c, int d){
	          double subtraction=(a*d - b*c) / (b*d);
			  System.out.println("Subtraction: "+subtraction);
	}
   	public void fractionMul(int a, int b, int c, int d){
	          double mul= (a*c) / (b*d);
			  System.out.println("Multiplication: "+mul);
	}	
	   	public void fractionDiv(int a, int b, int c, int d){
	          double div= (a*d) / (b*c);
			  System.out.println("Divide: "+div);
	}	
    
	public static void main(String args[]){
		Fraction obj=new Fraction();
		Scanner sc=new Scanner(System.in);
		char again='y';
		while (again=='y'){
	    System.out.print("Enter first fraction, operator and second fraction: ");
        String input = sc.nextLine();
        String[] Array = input.split(" ");
		int a=Integer.parseInt(Array[0]);
		int b=Integer.parseInt(Array[1]);
		int c=Integer.parseInt(Array[3]);
		int d=Integer.parseInt(Array[4]);
		switch(Array[2])
		{
			case "+": 
			obj.fractionAdd(a,b,c,d);
		 break;
		    case "-": 
		    obj.fractionSub(a,b,c,d);
		 break;
		    case "*": 
		    obj.fractionMul(a,b,c,d);
		 break;
		 	case "/": 
		    obj.fractionDiv(a,b,c,d);
		 break;
		 default: 
		 System.out.println("Invalid input");
		}
		System.out.println("Want to do it again y/n");
		again = sc.next().charAt(0);
		}
	}
}