import java.util.ArrayList;
     public class Demo{
     public static void main(String args[]){
      ArrayList li =new ArrayList();
	  li.add(2);
	  li.add(3);
	  li.add(4);
	  System.out.println(li);
	      ArrayList li2 =new ArrayList();
  	  li2.add("aaa");
	  li2.add("bbb");
	  li2.add("ccc");
	  li2.addAll(li);
	  System.out.println(li2);
	  System.out.println(li2.contains("ccc"));
	 System.out.println(li2.isEmpty());
	  System.out.println(li2.size());
 }
}