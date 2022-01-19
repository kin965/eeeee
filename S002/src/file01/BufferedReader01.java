package file01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader01 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\jinch\\OneDrive\\デスクトップ\\text.txt");// 新建对象
		try {
			FileReader fr = new FileReader(file);// 读取文件
			BufferedReader br = new BufferedReader(fr);// 传输文件

			/*
			 * BufferedReader br = new BufferedReader (new InputStreamReader (new
			 * FileInputStream ("C:\\data.txt""UTF-8"))
			 */
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);

			}
		} catch (IOException e) {

			e.printStackTrace();

		}
	}
}
