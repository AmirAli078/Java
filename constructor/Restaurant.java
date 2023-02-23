public class Restaurant {
	String owner;
	String nameRestaurant;
	String location;
	long  contactNo;
	String salogan;
	public Restaurant(String owner,String nameRestaurant,long contactNo,String salogan) {
		this. owner=owner;
		this. nameRestaurant=nameRestaurant;
		this.contactNo=contactNo;
		this. salogan=salogan;
	}

	public static void main(String[] args) {
		Restaurant Food=new Restaurant(" Amir Ali"," RoofTop",3002888377l,"A bite away from you");
		System.out.println("owner name: "+Food.owner);
		System.out.println("Restaurant name: "+Food.nameRestaurant);
		System.out.println("Contact No: "+Food.contactNo);
		System.out.println("Salogan: "+Food.salogan);

	}

}