class SquareSum{
	public int SquareSum(int num1, int num2, int num3 ){
		int sum=0;
		sum=num1*num1+num2*num2+num3*num3;
		return sum;
	}
	public static void main(String args[]){
		SquareSum s=new SquareSum();
		System.out.println("sum of square the 3 numbers is: "+s.SquareSum(2,3,4));
	}
}