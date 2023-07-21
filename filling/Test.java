//to display all files and directory 
import java.io.File;
public class Test {

	public static void main(String[] args) throws Exception {
		int count=0;
		File f=new File("C:\\Users\\aa014");
		String [] s=f.list();
		for(String s1 :s) {
			count++;
		System.out.println(s1);
		}
		System.out.println("Number of files is: "+count);

 }

}
//list method to display all files and records.