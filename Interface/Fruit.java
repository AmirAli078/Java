interface Fruit{
		void juice();
}
class Apple implements Fruit{
	public void juice(){
		System.out.println("Apple juice is here!");
	}
}
class Mango implements Fruit{
	public void juice(){
		System.out.println("Mango juice is here!");
	}
	public static void main(String args[]){
		Mango m=new Mango();
		m.juice();
		Apple a=new Apple();
		a.juice();
	}
}