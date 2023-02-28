interface Bowler{
	void getBowler();
}
class Fast implements Bowler{
	public void getBowler(){
	System.out.println("Fast Bowler Amir is here!");	
	}
}
class Spin implements Bowler{
	public void getBowler(){
	System.out.println("Spin bowler ajmal is here! ");
	}
	public static void main(String args[]){
		Spin s=new Spin();
		s.getBowler();
		Fast f=new Fast();
		f.getBowler();
	}
}
