interface Animal{
	void makeSound();
	void eat();
}
class Cat implements Animal{
	public void makeSound(){
	System.out.println("Cats sound be like Meow Meow");	
	}
	public void eat(){
	System.out.println("Cat eats meal");
	}
}
class Dog implements Animal{
	public void makeSound(){
	System.out.println("Dog always barks! ");
	}
	public void eat(){
	System.out.println("dog eats meal and meat both!");
	}
	public static void main(String args[]){
		Dog d=new Dog();
		d.makeSound();
		d.eat();
		Cat c=new Cat();
		c.makeSound();
		c.eat();
	}
}
