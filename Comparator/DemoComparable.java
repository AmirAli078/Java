import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
	String name;
	int age;
	public Students(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}

public class DemoComparable {
	public static void main(String[] args) {
		//sort the integer by their second digit value 
	      Comparator<Integer> com=new Comparator<Integer>() 
	      {
	    	  public int compare(Integer i,Integer j) {
	    		  if(i%10 > j%10) 
	    			  return 1;
	    		  
	    		  else 
	    			  return -1;
	    	  }
	      };
	      //sorted the string by the name
	      Comparator<String> name=new Comparator<String>() 
	      {
	    	  public int compare(String i,String j) {
	    		  if(i.length()>j.length()) 
	    			  return 1;
	    		  
	    		  else 
	    			  return -1;
	    	  }
	      };
	      //Comparator for the Objects of the students that sort the objects by its age values
	      Comparator<Students> student=new Comparator<Students>()
	      {
	    	public int compare(Students i, Students j) {
	    		if(i.age > j.age)
	    			return 1;
	    		else 
	    			return -1;
	    	}
	      };
		List<Integer> num=new ArrayList<>();
		num.add(2);
		num.add(4);
		num.add(7);
		num.add(1);
		num.add(9);
		Collections.sort(num);
		System.out.println(num);
		//we have another list in which we have 2 number digit and we want to sort with last digit...ex..23 so we compare 3 and swap the numbers 
		List<Integer> nums=new ArrayList<>();
		nums.add(23);
		nums.add(12);
		nums.add(44);
		nums.add(71);
		nums.add(30);
		Collections.sort(nums,com);
		System.out.println(nums);
		//sort the string by the length of the String  
		List<String> str=new ArrayList<>();
		str.add("Amir");
		str.add("Tahir Ali");
		str.add("Sadam Hussain");
		str.add("Aijaz Ali");
		Collections.sort(str,name);
		System.out.println(str);
	      // sorting the objects  by age number
		List<Students> studs=new ArrayList<>();
		studs.add(new Students("Amir",22));
		studs.add(new Students("Tahir",20));
		studs.add(new Students("Ali",19));
		studs.add(new Students("Aijaz",22));
		Collections.sort(studs,student);
		System.out.println("............Output just print method.................");
		System.out.println(studs);
		System.out.println("............Output throw for loop.................");
		System.out.println("............sorting throw age number.................");
		for(Students s: studs) 
		{
		System.out.println(s);
		}
		

	}

}
