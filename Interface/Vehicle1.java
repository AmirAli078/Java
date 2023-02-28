interface Vehicle1{
     void start();
	 default void display(){           // we can create default static and private method in interface.
		 System.out.println("Default method of display");
	 }
}
class Car implements Vehicle1{
	public void start(){
		System.out.println("Car Starts with key ");
	}
}
class Scooter implements Vehicle1{
	public void start(){
		System.out.println("Scooter Starts with Kick ");
	}	
	public static void main(String args[]){
		Scooter s=new Scooter();
		s.start();
		Car c=new Car();
		c.start();
		c.display();
	}
}