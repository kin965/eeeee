package pub001;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("nextLine方法で受け取り");
		if (scan.hasNextLine()) {
			String str2 = scan.nextLine();
			System.out.println("入力したデータは" + str2);
		}
		scan.close();
	}

}
