public class Main extends Thread{
public void run(){
	System.out.println("thread is running ");
}
public static void main(String args[]){
	Main m=new Main();
	m.start();
	System.out.println("Outside the thread");
}
}
