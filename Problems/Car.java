 class Car {
	private int seat;
	private int fuel;
	private String name;
	public Car(){
		this.seat=0;
		this.fuel=0;
		this.name="";
	}
	
	public Car(int s, int f,String n){
		this.seat=s;
		this.fuel=f;
		this.name=n;
	}
	public void show(){
		System.out.println("seats in cars: "+seat+ " fuel in car: "+fuel+" name of car: "+name);
		
	}
	public static void main(String args[]){
		Car c=new Car(2,8,"civic");
		c.show();
	}


}