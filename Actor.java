public class Actor{
	String FilmIndustry;
	String ActorName;
	String FamousMovie;
	int Age;
	String Height;
		public static void main(String[] args){
		Actor Star=new Actor();
		Star.FilmIndustry=" Hollywood";
		Star.ActorName="Jony Depp";
		Star.FamousMovie="Pirates of caribean";
		Star.Age=59;
		Star.Height=" 5 feet 10 iches ";
		
		System.out.println("actor FilmIndustry: "+Star.FilmIndustry);
		System.out.println("actor Name: "+Star.ActorName);
		System.out.println("actor Famous Movie: "+Star.FamousMovie);
		System.out.println("actor age : "+Star.Age);
		System.out.println("actor Height: "+Star.Height);
		}
	}