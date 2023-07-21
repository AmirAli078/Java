
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task {
	String z;
	ArrayList<String> words=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	File f=new File ("text.txt");
 public void wordCount() throws IOException  {
	 Scanner q=new Scanner(f);
	 while(q.hasNext()) {
		 z=(String) q.next();
		 words.add(z);
	 }
   System.out.println(words.size());
 }
	
	public static void main(String[] args) throws IOException {
          Task t=new Task();
           t.wordCount();
           
           

	}

}
