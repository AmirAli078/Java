import java.util.*;
import java.util.ArrayList;

public class GroceryProduct {
	private String name;
	private double price;
	private double discount;
	
public GroceryProduct(String name, double price, double discount) {
	this.name=name;
	this.price=price;
	this.discount=discount;
}
   public double getActualPrice() {
	return price-(price*discount/100);
   }
   public void display() {
	   System.out.println("...............................");
	   System.out.println("Name: "+name);
	   System.out.println("Price: "+price);
	   System.out.println("Discount: "+discount+"%");
	   System.out.println("Thank you");
	   System.out.println("...............................");
   }
   public String getName() {
	   return name;
   }
   public void setName(String name) {
	   this.name=name;
   }
   public double getPrice() {
	   return price;
   }
   public void setPrice(double price) {
	   this.price=price;
   }
   public double getDiscount() {
	   return discount;
   }
   public void setDiscount(double discount) {
	   this.discount=discount;
   }
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   Scanner sc2=new Scanner(System.in);
	ArrayList<GroceryProduct> cart=new ArrayList<GroceryProduct>();
	System.out.print("enter the product name: ");
	String name=sc2.nextLine();
	System.out.print("enter the price of product: ");
	int price=sc.nextInt();
	System.out.print("enter the discount on product: ");
	int discount=sc.nextInt();
	GroceryProduct toast=new GroceryProduct(name,price,discount);
	cart.add(toast);
	toast.display();
	//System.out.println("With discount: "+toast.getActualPrice());
	//System.out.println("Thank you");
   }
}
