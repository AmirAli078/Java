import java.util.Scanner;
class Empolyee{
	private int id_number;
	private float salary;
     public void empoloyeeInfo(int id_number, float salary){
		 this.id_number=id_number;
		 this.salary=salary;
	 }
	 public void display(){
		 System.out.println("Empolyee ID: "+this.id_number);
		 System.out.println("Empolyee Salary: "+this.salary);
	 }
	 public static void main(String args[]){
		 Scanner sc =new Scanner(System.in);
		   Employee[] employees = new Main[3];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new employee();
            System.out.print("Enter employee number: ");
            int num = sc.nextInt();
			float salary = sc.nextFloat();
            employees[i].empoloyeeInfo(num, salary);
        }
        for (int i = 0; i < employees.length; i++) {
            employees[i].display();
        }
			 
		 }
	 }