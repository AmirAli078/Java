public class Bike{
	String bikeName;
	int  model;
	String color;
	int price;
	String ownerName;
	public Bike(String bikeName,int model,String color, int price, String ownerName ) {
		this. bikeName=bikeName;
		this. model=model;
		this. color=color;
		this. price=price;
		this. ownerName=ownerName;
	}
		public static void main(String[] args){
		Bike Honda=new Bike("CD70",2023,"black",23000,"Amir");
		System.out.println("Bike Name: "+Honda.bikeName);
		System.out.println("Owner Name: "+Honda.ownerName);
		System.out.println("Bike Color: "+Honda.color);
		System.out.println("bike Model: "+Honda.model);
		System.out.println("Price of bike in pkr: "+Honda.price);
			}
		}
