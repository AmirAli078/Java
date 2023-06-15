import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1>{
	String name;
	int age;
	public Student1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + "]";
	}
	
	public int compareTo(Student1 that) {
		if(this.age>that.age)
		return 1;
		else 
			return -1;
	}
}
public class ComparableDemo {

	public static void main(String[] args) {
	List<Student1> st=new ArrayList<Student1>();	
	st.add(new Student1("amir",22));
	st.add(new Student1("aijaz",20));
	st.add(new Student1("sadam",22));
	st.add(new Student1("tahir",19));
	st.add(new Student1("ali",18));
	Collections.sort(st);
	
	for(Student1 s: st)
	{
	System.out.println(s);
	}

	}

}
