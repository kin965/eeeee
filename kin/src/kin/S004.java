package kin;

public class S004 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long kane = 2888;
		if (kane >= 500) {
			System.out.println(kane / 500 + "张500元");
		}
		kane = kane % 500;
		if (kane >= 100) {
			System.out.println(kane / 100 + "张100元");
		}
		kane = kane % 100;
		if (kane >= 5) {
			System.out.println(kane / 5 + "张5元");
		}
		kane = kane % 5;
		if (kane >= 2) {
			System.out.println(kane / 2 + "个钢镚");
		}

	}

}
