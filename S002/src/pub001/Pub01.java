package pub001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pub01 {
	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("文字を入力，`ｘ`を押すと退出する");
		do {
			c = (char) br.read();
			System.out.println(c);
		} while (c != 'x');
	}

}
