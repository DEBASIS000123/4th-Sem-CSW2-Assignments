import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the source file path:");
		String srcFilePath = scanner.nextLine();
		System.out.println("Enter the destination file path:");
		String destFilePath = scanner.nextLine();
		File srcFile = new File(srcFilePath);
		File destFile = new File(destFilePath);
		if (!srcFile.exists() || !srcFile.isFile()) {
			System.out.println("Source file does not exist ");
			return;
		}

		if (destFile.exists()) {
			System.out.println("Destination file already exists Do you want to copy in this file? (Yes/No)");
			String overwrite = scanner.nextLine();
			if (!overwrite.equalsIgnoreCase("yes")) {
				System.out.println("File copy cancelled.");
				return;
			}
		}

		try (FileReader in = new FileReader(srcFile); 
			FileWriter out = new FileWriter(destFile)) {
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("File content copied successful");
		} catch (IOException e) {
			System.err.println("Error occurred while copying file ");
		}
	}

}
