import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the file name: ");
		 String fileName = scanner.nextLine();
		 
		 File file = new File(fileName);
		 try {
		 if (!file.exists()) {
		 throw new FileNotFoundException("File not found: in that path");
		 
		 }
		 System.out.println("File metadata:");
		 System.out.println("Name: " + file.getName());
		 System.out.println("Path: " + file.getPath());
		 System.out.println("Absolute path: " + file.getAbsolutePath());
		 System.out.println("Parent: " + file.getParent());
		 System.out.println("Exists: " + file.exists());
		 System.out.println("Is file: " + file.isFile());
		 System.out.println("Is directory: " + file.isDirectory());
		 System.out.println("Is hidden: " + file.isHidden());
		 System.out.println("Length: " + file.length() + " bytes");
		 Date lastModifiedDate = new Date(file.lastModified());
		 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-DD");
		 System.out.println("Last modified: " + dateFormat.format(lastModifiedDate));
		 
		 System.out.println("Readable: " + Files.isReadable(Paths.get(fileName)));
		 System.out.println("Writable: " + Files.isWritable(Paths.get(fileName)));
		 System.out.println("Executable: " + Files.isExecutable(Paths.get(fileName)));
		 }catch (FileNotFoundException e) {
			 System.err.println(e);
			}finally {
			scanner.close();
			}
	}

}
