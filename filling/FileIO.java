
import java.io.File;

public class FileIO {

	public static void main(String[] args) throws Exception{
		File f=new File("Student1.txt");   //we have not created file yet so file will not exists.
		System.out.println(f.exists());   //we will get false in output. we have created a object of file not file
		f.createNewFile();             //now we have created a file 
        System.out.println(f.exists());  // now it will show true in console.
        System.out.println("Location of file: "+f.getAbsolutePath());  //complete path of the file 
        System.out.println("Name of file: "+f.getName());   //name of the file 
        //now we have create java file directory with the help of file class 
        System.out.println("---------------------------------------------------------");
        File fr=new File("Amir123");
        System.out.println(fr.exists());   //file dirctory is not created yet 
        fr.mkdir();
        System.out.println(fr.exists());  //now directory is created 
        
	}

}
