class CEO{
 int id;
  String name;
  int age;
  String company;
  
 public  CEO(int id,String name, int age, String company) {
    this.id=id;
	this.name = name;
    this.age = age;
    this.company = company;
 }
  public void Display() {
	System.out.println("ID: " +id);
    System.out.println("Name: " +name);
    System.out.println("Age: " +age);
    System.out.println("Company: " +company);
  }
}
class Manager extends CEO{
	 String department;
     int salary;

 public  Manager(int id,String name, int age, String company, String department, int salary) {
    super(id,name,age,company);
	this.department=department;
	this.salary=salary;
 }
  public void Display() {
	super.Display();
	System.out.println("Department: " +department);
    System.out.println("Salary: " +salary);
  }
  public static void main(String args[]){
	   Manager m=new Manager(22, "amir", 22, "Microsoft", "DATA SCIENCE", 23000);
	   m.Display();
  }
}