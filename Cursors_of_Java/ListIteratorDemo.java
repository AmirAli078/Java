import java.util.*;
public class ListIteratorDemo {

	public static void main(String[] args) {   //List itertaor is bi directional 
		LinkedList l=new LinkedList();         // it contains nine methods 
		l.add("Amir");                         // read, remove, repace and add methods 
		l.add("Peeral");                       //it contains all methods of iterator and enumeration method too 
		l.add("Inam");
		l.add("Rafay");
		System.out.println("Without using list iterator");
		System.out.println(l);
		System.out.println("using list Iterator");
      ListIterator itr=l.listIterator();
      while(itr.hasNext()) {
    	  String s=(String) itr.next();
    	  if(s.equals("Amir")) {   
    		  System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    		  System.out.println("Remove method to remove Amir ");           //remove method 
    		  itr.remove();
    		  System.out.println(l);
    		  System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    	  }
    	  else if(s.equals("Peeral")) {
    		  System.out.println("Set mehod to replace Peeral by saqib");
    		  itr.set("Saqib");                  // replace method
    		  System.out.println(l);
    		  System.out.println("....................................");
    	  }
    	  else if(s.equals("Rafay")) {
    		  System.out.println("Add method to add ubaid After Rafay");
    		  itr.add("Ubiad");
    		  System.out.println(l);
    		  System.out.println("________________________________________");
    	  }
      }
      System.out.println("After all operations");
      System.out.println(l);
	}

}
