public class Chips{
	String chipsBrand;
	String flavour;
	String salogan;
	int price;
	int quantity;
	public Chips(String chipsBrand,String flavour,String salogan, int price,int quantity ) {
		this. chipsBrand=chipsBrand;
		this. flavour=flavour;
		this. salogan=salogan;
		this. price=price;
		this. quantity=quantity;
	}

	public static void main(String[] args)
	{
	Chips Lays=new Chips(" Pringles "," Chutney Flavour"," Mind Popping! ",50,2);
		System.out.println("Chips Brand Name: "+Lays.chipsBrand);
		System.out.println("Chips Flavour: "+Lays.flavour);
		System.out.println("Chips Salogan: "+Lays.salogan);
		System.out.println("Chips Quantity: "+Lays.quantity);
		System.out.println("Price of Chips in pkr: "+Lays.price);
	
	}
}