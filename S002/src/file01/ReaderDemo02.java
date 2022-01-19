package file01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo02 {

	public static void main(String[] args) {
    File file =new File("C:\\Users\\jinch\\OneDrive\\デスクトップ\\a.txt");
    
    try {
		FileReader f =new FileReader(file);
		BufferedReader b=new BufferedReader(f);
		String line;
		while ((line=b.readLine())!=null) {
			System.out.println(line);
		}
		
		
	} catch (IOException e) {
		e.printStackTrace();
	}

	}

}
