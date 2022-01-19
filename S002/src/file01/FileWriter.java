package file01;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class FileWriter {

	public static void main(String[] args) {
		try {
			Writer out = new BufferedWriter(
	new OutputStreamWriter(new FileOutputStream("C:\\Users\\jinch\\OneDrive\\デスクトップ\\a.txt"), "UTF-8"));
			out.write("eqas");
			out.close();
		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
