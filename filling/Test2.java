//to display all directory only 
import java.io.File;

public class Test2 {

	public static void main(String[] args) throws Exception {
		int count=0;
		File f=new File("C:\\Users\\aa014");
		String [] s=f.list();
		for(String s1 :s) {
			File f1=new File(f,s1);
			if(f1.isDirectory()) {
				count++;
				System.out.println(s1);
			}
			
		}
		System.out.println("Number of directory is: "+count);
 }

}