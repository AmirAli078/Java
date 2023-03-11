class Scooter extends Vehicle{
	void start(){
		System.out.println("Starts with key");
	}
	public static void main(String args[]){
		Scooter s=new Scooter();
		s.start();
	}
	
}