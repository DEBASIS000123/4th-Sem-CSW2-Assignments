
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Q24 {

	public static void main(String[] args) {
		String filename = "file.txt";

        try {
            File file = new File(filename);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
	}

}
