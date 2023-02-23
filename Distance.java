public class Distance {
	public void distanceInPoints(int x1,int y1,int x2, int y2) {
		System.out.println("enter the points: "+x1+" "+y1+" "+x2+" "+y2);
		double disx1x2=x2-x1;
		disx1x2=Math.pow(disx1x2, 2);
		double disy1y2=y2-y1;
		disy1y2=Math.pow(disy1y2, 2);
		double result=disx1x2+disy1y2;
		double distance=Math.sqrt(result);
		System.out.println("Distance Between two points is: "+distance);
	
	}

	public static void main(String[] args) {
		Distance Obj=new Distance();
		Obj.distanceInPoints(11, 10, 9, 10);

	}

}