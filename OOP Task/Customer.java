import java.util.Scanner;
public class Customer{
	int id;
	String name;
	void getDeatils(int id, String name){
		this.id=id;
		this.name=name;
	}
	void showDetails(){
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		System.out.print("enter the id: ");
		id=sc.nextInt();
		System.out.print("enter the name: ");
		name=sc.next();
		Customer c=new Customer();
		c.getDeatils(id, name);
		c.showDetails();
		
	}

}