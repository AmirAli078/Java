import java.util.*;
public class IteratorDemo {

	public static void main(String[] args) {      //iterator used for any collection 
		ArrayList l=new ArrayList();               //it is universal iterator
        for(int i=0; i<=10; i++) {
        	l.add(i);                  //it has one more method then enumeration that is remove() method
        }
        System.out.println("without iterator cursor:");
        System.out.println(l);
        System.out.println("With iterator cursor");
        Iterator itr=l.iterator();
        while(itr.hasNext()) {
        	Integer i=(Integer) itr.next();
        	if(i%2==0) {
        		System.out.println(i);
        	}
        	else {
        		itr.remove();
        	}
        }
        System.out.println(l);                   //it is because it remove odd element through remove method
	}
                                                 //limitation of itertaor 
}                                                // it only works on forward dirction 
                                                 // it do not perform replace and add object operation 