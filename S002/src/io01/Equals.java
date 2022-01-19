package io01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

public class Equals {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		File file = new File("C:\\\\Users\\\\jinch\\\\OneDrive\\\\デスクトップ\\\\c.txt");

		try {
			Writer out = new BufferedWriter(
	        new OutputStreamWriter(new FileOutputStream("C:\\Users\\jinch\\OneDrive\\デスクトップ\\d.txt"), "UTF-8"));
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				String sm = null;
				sm = sm + line;
				if (sm.contains(line)) {
					out.write(line + "\n");

				}
			}
			out.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
