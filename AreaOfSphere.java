public class AreaSphere {
	public double areaOfSphere(int radius) {
		double area;
		System.out.println("enter the radius: "+radius);
		area=(4*3.142*radius*radius);
		System.out.println("Area of triangle is: "+area);
		return area;
	}

	public static void main(String[] args) {
      AreaOfSphere obj=new AreaOfSphere();
      obj.areaOfTriangle(12);

	}
	}