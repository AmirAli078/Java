import java.util.Scanner;
import java.lang.Math.*;
 class Power{
    public  double power(double n, int p) {
		double result=Math.pow(n,p);
		return result;
		}
    public int power(int n) {
		int result=Math.pow(n,2);
		return result;
	}
		public  int power(int n, int p) {
			int result=Math.pow(n,p);
	return result;
		}
    public static void main(String[] args) {
		Power p=new Power();
		System.out.println("return double value : " + p.power(2.0, 3));
        System.out.println( "default value of p will be selected as 2: " +p.power(2));
        System.out.println( " return integer value:  " +p.power(2,2));
    }
}