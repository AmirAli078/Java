// method overlading 
class Calculator{
    public double product(double x, double y){
		return x*y;
	}
	public double product(double x, double y, double z){
		return x*y*z;
	}
	public int product(int x, int y){
		return x*y;
	}
	public static void main (String args[]){
		Calculator c=new Calculator();
		double x = 12;
		double y = 2;
	 	double z = 4;
		int a=2;
		int b =4;
		System.out.println("Second Method is called: "+c.product(x,y,z));
		System.out.println("First Method is called: "+c.product(x,y));
		System.out.println("Third method is called: "+c.product(a,b));
		
	}
}