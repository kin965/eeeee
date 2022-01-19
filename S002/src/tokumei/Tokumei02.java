package tokumei;
//用匿名对象  作为方法的参数
import java.util.Scanner;

public class Tokumei02 {

	public static void main(String[] args) {

		// 一般的scannerの書き方
		// Scanner sc =new Scanner(System.in);
		// ikai(sc);

		// 匿名対象を使って、引数を入れる
		//ikai(new Scanner(System.in));
      Scanner sc=nikai();
      int i = sc.nextInt();
      System.out.println("数字は"+i);
	}

	public static void ikai(Scanner sc) {
         int i = sc.nextInt();
         System.out.println("入力した数字は"+i);
	}
	public static Scanner nikai() {
		//一般的書き方
		//Scanner sc =new Scanner(System.in);
		//return sc;
		return new Scanner(System.in);
	}

}
