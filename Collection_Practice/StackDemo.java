import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("Amir");
		s.push("Sadam");
		s.push("Majid");
		System.out.println(s);
		System.out.println(s.search("Amir")); // it will mention the index where it is located 
		System.out.println(s.search("Ubaid"));  // it will return -1 b/c it is not in a stack
		System.out.println(s.peek());    //it will return what is top of the stack
		System.out.println("Remove object from stack is : "+s.pop());   // remove top of the element 
		System.out.println(s);

	}

}
