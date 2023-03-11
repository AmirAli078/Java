import java.util.Scanner;
public class Customer3 {
	int id;
	String name;
	double basic;
	double salary;
	double da;
	double hra;
	double fa;
	public Customer3(int id , String name,double basic2) {
		this.id=id;
		this.name=name;
		this.basic=basic2;
		}
		public void salary() {
			if(basic>=5000 & basic<=10000) {
				 da=basic*0.40;
				 hra=basic*0.20;
				 fa=basic*0.10;
				 salary=(basic+da+hra-fa);
			}
			else if(basic>=3000 && basic<=5000) {
				 da=basic*0.30;
				 hra=basic*0.20;
				 fa=basic*0.10;
				 salary=(basic+da+hra-fa);
			}
			else if(basic<3000 ) {
				 da=basic*0.20;
				 hra=basic*0.10;
				 fa=basic*0.10;
			}
			else if(basic>=10000) 
			{
				 da=basic*0.50;
				hra=basic*0.30;
				 fa=basic*0.10;
				salary=(basic+da+hra-fa);
			}
			else {
				System.out.println("invalid input");
			}
	}
	
	public void showDetails() {
		System.out.println("                AAAAAAAA Pvt. Ltd.");
		System.out.println("===========================================");
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Basic: "+basic);
		System.out.println("DA(+): "+da);
		System.out.println("HRA(+): "+hra);
		System.out.println("FA(-): "+fa);
		System.out.println("____________________________________________");
		System.out.println("NET Salary: "+salary);
		System.out.println("================================================");
	}

	public static void main(String[] args) {
		int id;
		String name;
	     double basic;
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<5; i++) {
		System.out.print("Enter the id : ");
		id = sc.nextInt();
		System.out.print("Enter the name : ");
		name = sc.next();
		System.out.print("enter Basic Salary: ");
		basic=sc.nextDouble();
		Customer3 c=new Customer3(id,name,basic);
		c.salary();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("SALARY STATEMENT OF THE EMPOLYEES");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		c.showDetails();
		}
		}
}

