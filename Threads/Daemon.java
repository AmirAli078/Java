public class Daemon extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon()){
		System.out.println(" DAEMON Thread task");
        }
      else 		
		System.out.println("Thread task");
	}
		public static void main(String args[]){
			System.out.println("Hello");   //Deamon thread provides services to main thread
			Daemon d=new Daemon();    //if  comment the sop in main thread then Daemon thread will response nothin b/c main doing nothing
		//	d.setDaemon(true);
			d.start();
			
		}
}