import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;   //we use Arraylist when we have frequent operation is retrival of data the we us AL B/C it is random access
                                // worst case when we add or remove element from middle of Arraylist  
public class ArraylistDemo{

	public static void main(String[] args) {
		ArrayList l=new ArrayList();        //empty constructor having deafult size is 10
		l.add("Amir");   //String object
		l.add(10);      // integer object
		l.add("Amir");  //repeated object
		l.add(null);   // null object
		System.out.println("Display a Arraylist");
		System.out.println(l);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		l.remove(2);     //at index 2 Amir will be removed from the list
		System.out.println("After Removing Element at 2nd index");
		System.out.println(l);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		l.add(2, "Tahir");    //at index 2 it will added 
		System.out.println("after adding a element at 2nd index");
		System.out.println(l);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		l.add("Sadam");    //it will be added at last position 
		System.out.println("Adding a object without index position");
		System.out.println(l);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		ArrayList l1=new ArrayList();
		LinkedList l2=new LinkedList();
		System.out.println(l1 instanceof Serializable);                                     //Every collection is Serializable     true
		System.out.println(l2 instanceof Cloneable);                                        // every collection is Cloneable     true
		System.out.println("Every collection is Serializable and Cloneable");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(l1 instanceof RandomAccess );                                     //only arraylist and vector class is RandomAccess    true 
		System.out.println(l2 instanceof RandomAccess);                                       //linkedlist is not  randomAccess False 
        System.out.println("Only Arraylist and vector class is RandomAccess");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	}

}
