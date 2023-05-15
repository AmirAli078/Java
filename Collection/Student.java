import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Student{
	private int id;
	private String name;
	private int age;
	private String rollNumber;
	private String email;

	public Student(int id, String name, int age, String rollNumber, String email) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.rollNumber=rollNumber;
		this.email=email;
	}
	public int getId() {
		return id;
		
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public String getEmail() {
		return email;
	}
	public String toString() {
		return (id+" "+name+" "+age+" "+rollNumber+" "+email);	
	}
	public static void main(String[] args) {
		List <Student> c=new ArrayList<Student>();
		Scanner s=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		
		int ch;
	  do {
		  System.out.println("CRUD APPLICATION");
		  System.out.println("1: ADD STUDENT\n2: UPDATE STUDENT\n3: DELETE STUDENT\n4: GET STUDENT\n5: GET ALL STUDENT\n6 EXIT");
		  System.out.print("enter your choice: ");
		  ch=s.nextInt();
		  switch(ch) {
		  case 1: 
			  System.out.print("Enter student id: ");
			  int id=s.nextInt();
			  System.out.print("Enter student name: ");
			  String name=s2.nextLine();
			  System.out.print("Enter student age: ");
			  int age=s.nextInt();
			  System.out.print("Enter student Roll Number: ");
			  String rollNumber=s2.nextLine();
			  System.out.print("Enter student Email: ");
			  String email=s2.nextLine();		
			  c.add(new Student(id, name, age, rollNumber,email));
			  System.out.println("Student added successfully");
			  break;
		 case 2:
			  boolean found3 =false;
			  System.out.print("enter the id: ");
			  id=s.nextInt();
			  ListIterator<Student>Li= c.listIterator();
			  while(Li.hasNext()) {
				  Student e=Li.next();
				  if(e.getId()==id) 
				  {
					  found3 =true;
				  System.out.print("enter the new id: ");
				  id=s.nextInt();
				  System.out.print("enter the new name: ");
				  name=s2.nextLine();
				  System.out.print("enter the new age: ");
				  age=s.nextInt();
				  System.out.print("enter the new rollnumber: ");
				  rollNumber=s2.nextLine();
				  System.out.print("enter the new email: ");
				  email=s2.nextLine();
				  Li.set(new Student(id,name,age,rollNumber,email));
				System.out.println("Record is updated successfully");
			  }
			  if(!found3) {
				  System.out.println("Id does not exit here");
			  }
			  }
				  break;
		  case 3:
			  boolean found =false;
			  System.out.print("enter the id: ");
			  int id2=s.nextInt();
			  Iterator<Student> i= c.iterator();
			  while(i.hasNext()) {
				  Student e=i.next();
				  if(e.getId()==id2) 
				  {
					  found =true;
				  c.remove(e);
				  System.out.println("deleted successfully");
			  }
			  if(!found) {
				  System.out.println("Id does not exit here");
			  }
			  }
				  break;
			  
		  case 4:
			   found =false;
			  System.out.print("enter the id: ");
			int  id3=s.nextInt();
			   i= c.iterator();
			  while(i.hasNext()) {
				  Student e=i.next();
				  if(e.getId()==id3) 
				  {
				  found =true;
				  System.out.println(e);
			  }
			  System.out.println("........................................");
			  if(!found) {
				  System.out.println("Id does not exit here");
			  }}
				  break;
			  
		  case 5:
			  System.out.println(".........................................");
			  System.out.println("ID Name Age rollnumber gaccount ");
			  i= c.iterator();
			  while(i.hasNext()) {
				  Student e=i.next();
				  System.out.println(e);
			  }
			  System.out.println("........................................");
				  break;
		  }
	  }
	  while(ch!=6);

	}

}
