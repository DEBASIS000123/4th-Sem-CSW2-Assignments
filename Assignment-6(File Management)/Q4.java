import java.io.File;

public class Q4 {
	public static void main(String[] args) {
		String directoryPath = "D:\\Assignments\\Csw";
		File directory = new File(directoryPath);
		if (!directory.exists()) {
			System.out.println("The directory does not exist.");
			return;
		}
		File[] files = directory.listFiles();
		if (files.length == 0) {
			System.out.println("The directory is empty.");
			return;
		}
		System.out.println("Files and directories in " + directory);
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
}