import java.util.Scanner;
class Time{
     private int hours;
	 private int  minutes;
	 private int seconds;
  public void getTime(int seconds) {
        this.hours = seconds / 3600;
        this.minutes = (seconds % 3600) / 60;
        this.seconds = (seconds % 3600) % 60;
    }
	public void display(){
		System.out.print(hours+":"+minutes+":"+seconds);
	}
	public static void main(String args[]){
		int seconds;
		Scanner sc=new Scanner(System.in);
		Time obj=new Time();
		System.out.println("Enter the seconds");
		seconds=sc.nextInt();
		obj.getTime(seconds);
		obj.display();
	}
}