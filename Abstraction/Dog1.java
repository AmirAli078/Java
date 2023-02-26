class Dog1 extends Animal1 {
   void eat(){
	   System.out.println("Dog eats a meal and meat");
   }
    void sound(){
	   System.out.println("Bark");
   }
 public static void main(String args []){
	 Dog1 d=new Dog1();
	 d.eat();
	 d.sound();
	 
 }
}