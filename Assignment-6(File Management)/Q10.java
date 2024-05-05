import java.io.File;
import java.util.Scanner;

class DirectoryNotFoundException extends Exception {
	public DirectoryNotFoundException(String message) {
		super(message);
	}
}

public class Q10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the directory path: ");
		String dirPath = scanner.nextLine();
		File dir = new File(dirPath);
		try {
			if (!dir.exists() || !dir.isDirectory()) {
				throw new DirectoryNotFoundException("Directory not Found");
			}
			System.out.println("Directory listing:");
			listFilesAndDirectories(dir, "");
		} catch (DirectoryNotFoundException e) {
			System.err.println(e);
		} finally {
			scanner.close();
		}
	}

	private static void listFilesAndDirectories(File dir, String indent) {
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				System.out.println(indent + "[" + file.getName());
				listFilesAndDirectories(file, indent + " ");
			} else {
				System.out.println(indent + file.getName());
			}
		}
	}
}
