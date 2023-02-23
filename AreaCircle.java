public class AreaCircle {
	public double areaOfCircle(int radius) {
		double area;
		System.out.println("enter the radius: "+radius);
		area=(3.142*radius*radius);
		System.out.println("Area of Circle is: "+area);
		return area;
	}

	public static void main(String[] args) {
      AreaCircle obj=new AreaCircle();
      obj.areaOfCircle(10);

	}
	}