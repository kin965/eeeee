package file01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo01 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\jinch\\OneDrive\\デスクトップ\\b.txt");

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
