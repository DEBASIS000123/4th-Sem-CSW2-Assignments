import java.io.*;

public class Q2 {

	public static void main(String[] args) {
		File file = new File("diary1.txt");
		if (!file.exists()) {
			System.out.println("The file " + file + " does not exists");
			return;
		}

		try (FileReader fileReader = new FileReader(file)) {
			int character;
			System.out.println("Diary entries:");
			while ((character = fileReader.read()) != -1) {
				System.out.print((char) character);
			}
		} catch (IOException e) {
			System.out.println("An error occurred while reading the file");
		}

	}

}
