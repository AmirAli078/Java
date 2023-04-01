class Rodent{
   public void eat(){
	System.out.println("Rodent is eating seeds and grains");
  }
   public void running(){
	System.out.println("Rodent is running");
   }
}
class Mouse extends Rodent{
	public void eat(){
		System.out.println("Mouse eats fruits and grains");
	}
	public void running(){
		System.out.println("Mouse is running");
	}
}
class Gerbil extends Rodent{
	public void eat(){
		System.out.println("Gerbil eats apple and banana");
	}
	public void running(){
		System.out.println("Gerbil is running");
	}
}
class Hamster extends Rodent{
	public void eat(){
		System.out.println("Hamster eats vegetables and fruits");
	}
	public void running(){
		System.out.println("Hamster is running");
	}
	public static void main(String args[]){
		Rodent [] array=new Rodent[3];
	   array[0]=new Mouse();
	   array[1]=new Gerbil();
	   array[2]=new Hamster();
	   for(int i=0; i<array.length; i++){
		   Rodent r=array[i];
		   r.eat();
		   r.running();
	   }
	}
}