import java.io.File;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the current file name: ");
		String srcName = scanner.nextLine();
		System.out.print("Enter the new file name: ");
		String destName = scanner.nextLine();
		File srcFile = new File(srcName);
		File destFile = new File(destName);
		if (srcFile.renameTo(destFile)) {
			System.out.println("File renamed successfully.");
		} else {
			System.err.println("Error renaming file.");
		}
		scanner.close();
	}

}
