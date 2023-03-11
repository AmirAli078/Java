class Car{
	public void printSpeed(int speed){
		System.out.println("speed: "+speed);
	}
	public int fuel(int fuel){
		return fuel;
	}
}

class Demo{
	public static void main(String args[]){
		Car c=new Car();
		c.printSpeed(100);
		c.fuel(4);
		System.out.println("Fuel in litres: "+c.fuel(4));
	}

}