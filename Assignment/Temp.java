import java.util.Scanner;
class Temp{
	
   public void fahrenhiet(double c)
   {
         double far=(c*9/5)+32;
		 System.out.println("celsius "+c+"C to fahrenhiet: "+far+"F");
   }
   
   public void celsius(double f)
   {
         double cel=(f-32)*5/9;
		 System.out.println("Fahrenhiet  "+f+"F to Celsius: "+cel+"C");
   }
   
     public static void main(String args[]){
		 Scanner sc =new Scanner(System.in);
		 Temp obj =new Temp();
		 System.out.println("1: to convert fahrenhiet to celsius\n2: to convert celsius to fahrenhiet");
		 System.out.print("Select the type of conversion: ");
		 int a=sc.nextInt();
		 switch(a){
			 case 1:
			 System.out.print("enter the fahrenhiet temperature: ");
			 float c=sc.nextFloat();
			 obj.celsius(c);
			 break;
			 case 2:
			 System.out.print("enter the celsius temperature: ");
			 float f=sc.nextFloat();
			 obj.fahrenhiet(f);
			 break;
			 default : 
			 System.out.println("invalid input ");
		 }
	 }

}