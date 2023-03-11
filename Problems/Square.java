 //import java.Util.*;
 class Square implements shape{
	public void calculateArea(){
		double s=20;
		double area=s*s;
		Syem.out.println("area of square is: "+area);
}
	public shape setObjectShape(String s){
		if(s.equals("circle")){
		return new Circle();	
		}
		else if(s.equals("Square")){
			return new Square();
		}
		else {
			return new Circle();
		}
	}
	public static void main(String args[]){
		Shape s=setObjectShape("Circle");
		s.calculateArea();
	}
 }