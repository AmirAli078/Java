public class Main1 implements Runnable{
public void run(){
	System.out.println("thread is running ");
}
public static void main(String args[]){
	Main1 m=new Main1();
	Thread t=new Thread(m);
	t.start();
	System.out.println("Outside the thread");
}
}