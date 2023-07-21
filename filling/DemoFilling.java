import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFilling {

	public static void main(String[] args) throws IOException{
		FileWriter fw=null;
		try {
		File file =new File("Student.txt");
		fw=new FileWriter(file);
		fw.write("Amir\n");
		fw.write("Israr\n");
		fw.write("Yaseen\n");
		}catch(IOException ex){
			ex.printStackTrace();
		}finally {
			fw.close();
		}
		System.out.println("Successfully saved");

	}

}
