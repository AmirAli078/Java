import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Empolyee {

	public static void main(String[] args) {
		Map<Integer,String> empolyee=new HashMap<Integer,String>(); 
      empolyee.put(101, "Amir");
      empolyee.put(102, "Tahir");
      empolyee.put(103, "Zulfiqar");
      empolyee.put(104, "Touqeer");
      empolyee.put(105, "Govind");
      System.out.println("Iterate the map by using iterator");
      Set convertMap= empolyee.entrySet();
      Iterator itr=convertMap.iterator();
      while(itr.hasNext()) {
    	  System.out.println(itr.next());
      }
      System.out.println("_____________________________________________________________");
      System.out.println("Iterate a Map using for Each loop");
      for(Map.Entry<Integer,String> entry:empolyee.entrySet()){
    	  System.out.println(entry.getKey()+" : "+entry.getValue());
      }
	}

}
