import java.util.Scanner;
class Clock {
private int hour;
private int minutes;
private int seconds;
private boolean AM;
 public void Clock() {
  this.hour = 12;
  this.minutes = 0;
  this.seconds = 0;
  this.AM = true;
    }
  public void Clock(int hour, boolean AM) {
    this.hour = hour;
	this.AM = AM;
    this.minutes = 0;
    this.seconds = 0;
	
    }
  
   public void Clock(int hour, int minutes, int seconds, boolean AM) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
        this.AM = AM;
    }
    public void setTime(int hour, int minutes, int seconds, boolean AM) {
       this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
        this.AM = AM;
    }
    public int getHour() {
        return this.hour;
    }
    public int getMinutes() {
        return this.minutes;
    }
    public int getSeconds() {
        return this.seconds;
    }
    public boolean getAM() {
        return this.AM;
    }
	public void display(){
		System.out.println("Hours: "+hour);
		System.out.println("Minutes: "+minutes);
		System.out.println("Seconds: "+seconds);
		System.out.println("Am: "+AM);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Hours of time: ");
		int hour=sc.nextInt();
		System.out.print("Enter the Minutes of time: ");
		int minutes=sc.nextInt();
		System.out.print("Enter the seconds of time: ");
		int seconds=sc.nextInt();
		System.out.print("Enter the AM or PM: ");
		boolean AM=sc.nextBoolean();
		Clock c=new Clock();
		 c.setTime(hour,minutes,seconds,AM);
	      c.display();
	}
}
