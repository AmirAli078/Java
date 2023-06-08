interface sum
{
	public void add(int a, int b);
}
public class Lambda_Expression1 {

	public static void main(String[] args) {
		sum s=( a, b)->System.out.println("Sum of Numbers: "+(a+b));
		s.add(10, 20);               //lambda expression is anoynmous function
		s.add(30, 70);                  //having no name , no return type , no modifier
		s.add(10, 10);
		s.add(30,30);
	}
}