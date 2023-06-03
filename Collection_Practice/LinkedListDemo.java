import java.util.*;
public class LinkedListDemo {   //we use linkedlist when we perform addation and remove operation at middle of list 
                                  // worst case when frequent operation is retvial of data 
                                   //data structure doubly LinkedList	
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Amir"); 
		l.add(30);
		l.add(null);
		l.add("Amir");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(l);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		l.add(0, "Engineer");
		System.out.println("It will simply add object at 0 index and replace the first object Amir");
		System.out.println(l);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		l.removeLast();
		System.out.println("it remove last element of list is Amir");
		System.out.println(l);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        l.addFirst("Tahir");
        System.out.println("Add element at first index at 0 and replace the orginal element ");
        System.out.println(l);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
       System.out.println( l.contains("Amir")); //check object is present or not amir is present in a lis it will display true
       System.out.println(l.getFirst()); // it will display 1st element of list
       System.out.println(l.getLast()); // it will display last element of list
       System.out.println(l.get(2));    // it will display the value which is at 2nd index
       System.out.println(l.peek());  // peek means first element in a lsit 
       System.out.println(l.remove()); // it will remove the first element of list 
       System.out.println(l);
       System.out.println(l.remove(2)); // it will remove the object which is at 2nd index
       System.out.println(l);	
       }

}
