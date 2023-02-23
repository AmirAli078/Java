public class Actor{
	String filmIndustry;
	String actorName;
	String famousMovie;
	int age;
	String height;
	public Actor(String filmIndustry,String actorName,String famousMovie, int age,String height ) {
		this. filmIndustry=filmIndustry;
		this. actorName=actorName;
		this. famousMovie=famousMovie;
		this. age=age;
		this. height=height;
	}
	
		public static void main(String[] args){
		Actor Star=new Actor(" Hollywood","Jony Depp","Pirates of caribean",59," 5 feet 10 iches ");
	
		
		System.out.println("actor FilmIndustry: "+Star.filmIndustry);
		System.out.println("actor Name: "+Star.actorName);
		System.out.println("actor Famous Movie: "+Star.famousMovie);
		System.out.println("actor age : "+Star.age);
		System.out.println("actor Height: "+Star.height);
		}
	}