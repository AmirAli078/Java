abstract class Vehicle {
	int tyres;
	abstract void start();
}

class Scooter extends Vehicle{
	void start(){
		System.out.println("Scooter Starts with key");
	}
}

class Car extends Vehicle{
	void start(){
		System.out.println("Car Starts with key");
	}
	public static void main(String args[]){
		Car c = new Car();
		c.start();
		c.tyres=4;
		System.out.println("no of tyres in car is: "+c.tyres);
		Scooter s=new Scooter();
		s.start();
		s.tyres=2;
		System.out.println("no of tyres in Scooter is: "+s.tyres);
	}
}