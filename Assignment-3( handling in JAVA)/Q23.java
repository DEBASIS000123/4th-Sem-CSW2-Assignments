
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q23 {

	public static void main(String[] args) {
		  String f_name = "File.txt";
	        try {
	            BufferedReader reader = new BufferedReader(new FileReader(f_name));
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	            reader.close();
	        } catch (IOException e) {
	            System.out.println("An error occurred while reading the file: " + e.getMessage());
	            System.out.println(e);
	        }
	    }

}
