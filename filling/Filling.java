import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filling {

	public static void main(String[] args) throws IOException {
		//Student s=new Student();
		FileWriter fw=null;
		try {
		File file =new File("student.txt");
		fw=new FileWriter(file);
		fw.write("Amir\n");
		fw.write("Ahmed");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			fw.close();
		}
		System.out.println("successfully added");
		System.out.println("-----------Get Data-----------");
		FileReader fr=new FileReader("student.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line !=null) {
			System.out.println(line);
			line=br.readLine();
		}
		fr.close();
	}

}
