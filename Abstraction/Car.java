class Car extends Vehicle{
	void start(){
		System.out.println("Starts with key");
	}
	public static void main(String args[]){
		Car c=new Car();
		c.start();
	}
	}