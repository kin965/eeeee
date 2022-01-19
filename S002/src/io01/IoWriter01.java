package io01;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class IoWriter01 {

	public static void main(String[] args) {
		try {
			Writer out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream("C:\\Users\\jinch\\OneDrive\\デスクトップ\\text.txt"), "UTF-8"));
			out.write("DCNet Java 教育");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
