package file01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Text01 {

	public static void main(String[] args) {
		File file = new File("D:\\javaio基本概念.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String line;
			List<String> lineList = new ArrayList<String>();
			while ((line = br.readLine()) != null) {
				
				if(line.contains("不正ログインが検知されました")) {
					//System.out.println(line);
				}
				if(line.indexOf("不正ログインが検知されました") != -1) {
					System.out.println(line);	
				}
//				lineList.add(line);
//				int i = line.indexOf("不正ログインが検知されました");
//				if (i > 0) {
//					Writer out = new BufferedWriter(new OutputStreamWriter(
//							new FileOutputStream("C:\\Users\\jinch\\OneDrive\\デスクトップ\\a.txt"), "UTF-8"));
//					out.write(line);
//					out.close();
//				}
			}
			
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
