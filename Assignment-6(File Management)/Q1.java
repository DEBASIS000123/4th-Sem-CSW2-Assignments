import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your diary entry:");
		String entry = scanner.nextLine();
		File file = new File("diary.txt");
		try {
			if (file.exists()) {
				System.out.println("The file 'diary.txt' already exists. Existing file will not be overwritten. "
						+ "Do you want to append to it? (Y/N)");
				String response = scanner.nextLine().trim().toLowerCase();
				if (response.equals("y")) {
					FileWriter writer = new FileWriter(file, true);
					writer.write(getCurrentDate() + "\n" + entry);
					writer.close();
					System.out.println("Diary entry added successfully");
				}
				else{
					 System.out.println("Exiting without making any change");
					 return;
					 }
			}
			else {
				if (file.createNewFile()) {
					 System.out.println("File 'diary.txt' created Sucessfully. Run the program again.");
					 } else {
					 System.out.println("Failed to create file file");
					 return;
					 }
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			scanner.close();
		}

	}
	private static String getCurrentDate() {
		 Date date = new Date();
		 return new SimpleDateFormat("dd-MM-yyyy").format(date);
		 }

}
