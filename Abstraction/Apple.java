class Apple extends Fruit{
	int price;
	public  void juice(){
	System.out.println("Apple juice");
	}
	public static void main(String args[]){
	Apple a=new Apple();
	a.price=120;
	System.out.println("Price per kg is: "+a.price);
	a.juice();
	}
}