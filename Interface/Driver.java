interface Driver{
     void getDriver();
}
class Car implements Driver{
	public void getDriver(){
	System.out.println("Car Driver is here!");	
	}
	
}
class Truck implements Driver{
	public void getDriver(){
		System.out.println("truck driver is here! ");
	}
	public static void main(String args[]){
		Truck t=new Truck();
		t.getDriver();
		Car c=new Car();
		c.getDriver();
	}
}