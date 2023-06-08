interface interf{
	public void m1();      //interface has only one abstract method
}
public class Lambda_Expression {

	public static void main(String[] args) {
	interf i=()->System.out.println("hello world...by lambda expression");
	i.m1();     //invoking lambda Expression
	//i.m1();
//	i.m1();
	//i.m1();

	}

}