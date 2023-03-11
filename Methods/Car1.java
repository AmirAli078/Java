// getter ans setter method 
class Car1{
	private int speed;
	
	public void setSpeed(int x){
		speed = x;
	}
	public int getSpeed(){
		return speed;
	}
}
class Honda {
	public static void main(String args[]){
		Car1 c= new Car1();
		c.setSpeed(100);
		System.out.println(c.getSpeed());
	}
}