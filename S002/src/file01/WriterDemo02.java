package file01;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class WriterDemo02 {

	public static void main(String[] args) {
		try {
			Writer out = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream("C:\\Users\\jinch\\OneDrive\\デスクトップ\\d.txt"), "UTF-8"));
			out.write("tony");
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
