/*Create a class called Student. It will contain member functions that will read and print student’s detail 
using atleast 8 of the student’s attributes for example: his/her ID, First name, Last Name, Contact, City, 
DOB, Current Semester, No. of courses enrolled etc.
The program should allow the user to enter his/her details and print them accordingly
*/
import java.util.Scanner;
class Student{
	private int id;
	private String firstName;
	private String lastName;
	private long contact;
	private String city;
	private String dob;
	private int currentSemester;
	private int noOfCourseEnrolled;
 public void read(int id, String firstName, String lastName, long contact, String city, String dob, int currentSemester, int noOfCourseEnrolled){
	 this.id=id;
	 this.firstName=firstName;
	 this.contact=contact;
	 this.city=city;
	 this.dob=dob;
	 this.currentSemester=currentSemester;
	 this.noOfCourseEnrolled=noOfCourseEnrolled;
 }
 public void display(){
	 System.out.println(" ID: "+id);
	 System.out.println("First Name: "+firstName);
	 System.out.println("Last Name: "+lastName);
	 System.out.println("Contact: "+contact);
	 System.out.println("City: "+city);
	 System.out.println("DOb: "+dob);
	 System.out.println("Current Semester: "+currentSemester);
	 System.out.println("No Of Courses Enrolled: "+noOfCourseEnrolled);
 }
  public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter Your ID: ");
	  int id=sc.nextInt();
	  System.out.print("Enter Your First name: ");
	  String firstName=sc.next();
	  System.out.print("Enter Your Last name: ");
	  String lastName=sc.next();
	  System.out.print("Enter Your Contact Number: ");
	  long contact=sc.nextLong();
	  System.out.print("Enter Your City name: ");
	  String city=sc.next();
	  System.out.print("Enter Your Date of Birth : ");
	  String dob=sc.next();
	  System.out.print("Enter Your current Semester: ");
	  int currentSemester=sc.nextInt();
	  System.out.print("Enter Your number of courses you enrolled: ");
	  int noOfCourseEnrolled=sc.nextInt();
	  Student st=new Student();
	  st.read(id, firstName, lastName, contact, city, dob, currentSemester,  noOfCourseEnrolled);
	  st.display();
  }

}