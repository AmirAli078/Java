import java.util.*;
public class EnumerationDemo {
                                                //limitation of enumeration
	public static void main(String[] args) {   // enumeration only used in legacy classes
		Vector v=new Vector();                 // it only use for iterator 
		for(int i=0; i<=10; i++) {               // it moves in forward dirction only
			v.addElement(i);
		}
		System.out.println("Without Enumeration");   //enumeration help us to iterate the element according to our need
		System.out.println(v);
		Enumeration e = v.elements();
		System.out.println("with enumeration: ");
		while(e.hasMoreElements()) {
			Integer i=(Integer)e.nextElement();   
			if(i%2==0) {                             //here we wants only even numbers to display
				System.out.println(i);
			}
		}
       System.out.println(v);
	}

}
