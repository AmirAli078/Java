public class DemoName{

public static void main(String args[]){
	System.out.println("hello");
	System.out.println("Previous thread name: "+Thread.currentThread().getName());
	Thread.currentThread().setName("Amir");
	System.out.println("New thread name: "+Thread.currentThread().getName());
}

}