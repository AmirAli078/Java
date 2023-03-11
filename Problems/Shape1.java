import java.util.Scanner;
 interface Shape1{
	void area();
}
public class Circle implements Shape1 {
     public void area() {
    	   double PI=3.14;
    	   double r=22.0;
    	   double area =PI*r*r;
    	   System.out.println("the area of circle is: "+area);
    	   
       }
}
public class Square implements Shape1 {
	public void area() {
		double s=20;
		double area =s*s;
		System.out.println("area of square is: "+area);
	}
	public static Shape1 setObject(String s) {
		if(s.equals("circle")) {
		return new Circle();
		}
		
		else if(s.equals("square")) {
			return new Square();
		}
		else {
		return new Circle();	
		}
	}
	public static void main(String args[]) {
		String shape;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Shape: ");
		shape =sc.next();
		Shape obj= setObject(shape);
		obj.area();
	}
}

