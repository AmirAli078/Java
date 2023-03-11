public class Shape1 {
	public void area() {
		System.out.println("Area of Shape: ");
	}
	}
	class Circle extends Shape1{
		double pi=3.142;
		int radius=22;
		public void area() {
			double area =pi*radius*radius;
			System.out.println("Area of Circle: "+area);
		}
	}
	
	class Square extends Shape1{
		int side;
		public void area() {
			side=22;
			double area=side*side;
			System.out.println("area of Square is: "+area);
		}
	}
	
	class Rectangle extends Shape1{
		int length=10;
		int base=10;
		public void area() {
			double area=length*base;
			System.out.println("area of Rectangle is: "+area);
		}
	public static void main(String args[]) {
		Rectangle r=new Rectangle();
			r.area();
			Square s=new Square();
			s.area();
	}
	}

