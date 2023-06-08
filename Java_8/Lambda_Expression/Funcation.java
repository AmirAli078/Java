import java.util.function.Function;
import java.util.function.Predicate;

public class Funcation {
  public static int square(int n) {    //it is lengthy code but with java8 we can concise it 
		return n*n;
	}
	public static void main(String[] args) {
		//System.out.println("Square of 4: "+square(4));
		Function<Integer,Integer> f=i->i*i;           //with the help of function we can concise it.
		System.out.println("square of 5: "+f.apply(5));           //that is called lambda expression
		Predicate<Integer>p=i->i%2==0;
		System.out.println(p.test(4)); //now 4 is even or odd so it is even so o/p will be true
	}

}