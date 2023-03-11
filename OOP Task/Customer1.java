import java.util.Scanner;
public class Customer1{
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
		for(int i=0; i<5; i++){
		System.out.print("enter the id: ");
		id=sc.nextInt();
		System.out.print("enter the name: ");
		name=sc.next();
		Customer1 c=new Customer1();
		c.getDeatils(id, name);
		c.showDetails();
		}
		
	}

}