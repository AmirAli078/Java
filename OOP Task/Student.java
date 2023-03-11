import java.util.Scanner;
public class Student {
	 int id;
	String name;
	public void getStudent(String name, int id) {
		this.name=name;
		this.id=id;
		
	}
	public void displayStudent() {
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		
	}
}
class Exams extends Student{
	int sub1,sub2,sub3;
	public void getMark(int sub1, int sub2, int sub3) {
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	public void showMarks() {
		System.out.println("sub1: "+sub1);
		System.out.println("sub2: "+sub2);
		System.out.println("sub3: "+sub3);
	}
	public static void main(String[] args) {
		int id;
		String name;
		int sub1,sub2,sub3;
      Scanner sc=new Scanner(System.in);
	  for (int i=0; i<5; i++){
      System.out.print("enter  id: ");
      id=sc.nextInt();
      System.out.print("enter the name: ");
      name=sc.next();
      System.out.print("enter the marks of three subjects: ");
      sub1=sc.nextInt();
      sub2=sc.nextInt();
      sub3=sc.nextInt();
      Exams e=new Exams();
      e.getStudent(name, id);
      e.getMark(sub1, sub2, sub3);
	  System.out.println("Students details are: ");
	  e.displayStudent();
      e.showMarks();
      }
      
	}

}
