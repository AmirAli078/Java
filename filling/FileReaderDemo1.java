import java.io.File;
import java.io.FileReader;
//file reader class used to read  something from the file 
import java.io.IOException;

public class FileReaderDemo1{

	public static void main(String[] args) throws IOException {
		File f=new File("abc.txt");
		FileReader fr=new FileReader(f);
		char[] ch=new char[(int)f.length()];      // method to read data in the form of arrays
	    fr.read(ch);
	    for(char ch1: ch) {
	    	System.out.print(ch1);
	    }
	    fr.close();
 }

}