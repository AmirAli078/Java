import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();         // intial capacity of vector is 10
		System.out.println("intial capcity of vector is: ");
		System.out.println(v.capacity());
		for(int i=1; i<=10; i++) {
		v.addElement(i);
		System.out.println(i);
		}
		
		System.out.println("After adding 10 elemnets in a vector size is : ");
      System.out.println(v.capacity());
      v.addElement("AA");
      System.out.println(v);
      System.out.println("Adding 11th element in vector so it will be incresed by 2*cc");
      System.out.println(v.capacity());
      
      System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		Vector v2=new Vector(15);         // intial capacity of vector is 15 
		System.out.println("now intial capcity of vector is: ");
		System.out.println(v2.capacity());
		for(int i=1; i<=10; i++) {
		v2.addElement(i);
		System.out.println(i);
		}
		
		System.out.println("After adding 10 elemnets in a vector size is : ");
    System.out.println(v2.capacity());
    v2.addElement("AA");
    System.out.println(v2);
    System.out.println("Adding 11th element in vector so vector sized is fixed 15 after that it will increase the value");
    System.out.println(v2.capacity());
    
    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	Vector v3=new Vector(10,2);         // intial capacity of vector is 10 and increment by 2 
	System.out.println("now intial capcity of vector is: ");
	System.out.println(v3.capacity());
	for(int i=1; i<=10; i++) {
	v3.addElement(i);
	System.out.println(i);
	}
	
	System.out.println("After adding 10 elemnets in a vector size is : ");
System.out.println(v3.capacity());
v3.addElement("AA");
System.out.println(v3);
System.out.println("Adding 11th element in vector so it will be incresed by 2");
System.out.println(v3.capacity());
	}
	}
