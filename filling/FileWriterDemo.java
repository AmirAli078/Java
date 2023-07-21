//file writer class used t write something to the file 
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo{

	public static void main(String[] args) throws IOException {
		//FileWriter fw=new FileWriter("abc.txt");  this constructor will override the data not append the data 
	  FileWriter fw=new FileWriter("abc.txt",true);
		fw.write(100);
		fw.write("ON\n is no more");
		fw.write('\n');
		char [] ch= {'a','b','c'};
		fw.write(ch);
		fw.flush();
		fw.close();
 }

}