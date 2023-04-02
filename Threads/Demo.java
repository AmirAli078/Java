public class Demo extends Thread{

		public void run(){
			System.out.println("Thread in run method: "+Thread.currentThread().getName());//it will return thread-0
			System.out.println("Thread is running");//we can aslo set method by thread.currentThread().setName("xyz");
		}
	public static void main(String args[]){
		Demo d=new Demo();
		d.start();
		System.out.println("Thread within a main method: "+Thread.currentThread().getName()); // it will return main thread 
		System.out.println(" thread-0 is: "+d.isAlive());
		System.out.println("Current main thread is :"+Thread.currentThread().isAlive());
	}
}