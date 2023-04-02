public class Red extends Thread{
   public void run(){
		   System.out.println("\t\t\tSTOP");
   }
}
 class Yellow extends Thread{
	public void run(){
      System.out.println("\t\t\tWAIT");
	}
}
 class Green extends Thread{
	public void run(){
      System.out.println("\t\t\tGO GO");
	}
}
 class TrafficSignal{
	public static void main(String args[]){ 
	System.out.println("\t\t\tTraffic Signal");
	Red r=new Red();
	try{
		Thread.sleep(1000);
		r.start();
		System.out.println("\t\t\tRED");
	}
	catch(Exception e){
		System.out.println(e);
	}
	
	Yellow y=new Yellow();
	try{
		Thread.sleep(10000);
		y.start();
		System.out.println("\t\t\tYELLOW");
	}
	catch(Exception e){
		System.out.println(e);
	}
		Green g=new Green();
	try{
		Thread.sleep(1000);
		g.start();
		System.out.println("\t\t\tGREEN");
	}
	catch(Exception e){
		System.out.println(e);
	}
	}
}