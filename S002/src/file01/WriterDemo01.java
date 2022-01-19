package file01;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriterDemo01 {

	public static void main(String[] args) {
	try
		{
		Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\jinch\\OneDrive\\デスクトップ\\c.txt"),"UTF-8"));
	    out.write("assss");
	    out.close();
		}catch (IOException e) {
        }
	
	}
}
