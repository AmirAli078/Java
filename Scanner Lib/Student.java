import java.util.Scanner;
public class Student{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		//String input
		String name=sc.nextLine();
		System.out.print("Enter your Age: ");
		//integer input
		int age =sc.nextInt();
		System.out.print("Enter the gender: ");
		//character input
		char g=sc.next().charAt(0);
		System.out.print("Current Semester: ");
		byte sem=sc.nextByte();
		System.out.print("Enter your CGPA: ");
		//Decimal value input 
		float gpa=sc.nextFloat();
		System.out.print("Enter salary: ");
		short salary=sc.nextShort();
		System.out.print("Enter your phone number: ");
		// longer value of integer in long data type
		long number=sc.nextLong();
		System.out.println("______________________________________________________________________");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+g);
		System.out.println("Semester: "+sem);
		System.out.println("CGPA: "+gpa);
		System.out.println("Salary: "+salary);
		System.out.println("Contact Number: "+number);
		

	}

}
