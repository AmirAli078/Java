class Mango extends Fruit{
	int price;
	public  void juice(){
	System.out.println("Mango juice");
	}
	public static void main(String args[]){
	Mango m=new Mango();
	m.price=120;
	System.out.println("Price per kg is: "+m.price);
	m.juice();
	}
}