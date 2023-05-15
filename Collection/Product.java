import java.util.Scanner;
public class Product implements Cloneable{
 int pid;
 String pname;
 double pcost;
 
public Product(int pid, String pname, double pcost){
	this.pid=pid;
	this.pname=pname;
	this.pcost=pcost;
}
 public void showDetails(){
	 System.out.println("Product ID: "+pid);
	 System.out.println("Product name: "+pname);
	 System.out.println("Product Cost: "+pcost);
 }
 
 public static void main(String args[]) throws CloneNotSupportedException{
	 Scanner sc =new Scanner(System.in);
	 System.out.println("enter the product id: ");
	 int pid= sc.nextInt();
	 System.out.println("enter the product Name: ");
	 String pname= sc.next();
	 System.out.println("enter the product cost: ");
	 double pcost= sc.nextDouble();
        System.out.println("....Product Details........");
	Product p1=new Product(pid, pname, pcost);
	Product p2= (Product) p1.clone();
	p2.showDetails();
 }
}