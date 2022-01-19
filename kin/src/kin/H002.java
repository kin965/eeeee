package kin;

public class H002 {
	public static void main(String[] args) {
		int sum = 0;
		// 最初のSUMの値を定義
		int[] array = new int[] { 1, 3, 5, 7, 100, 0, 1 };
		// 配列
		for (int i = 0; i < array.length; i++) {
			sum = (array[i] + sum);
			// 配列のSUMを求める
		}
		System.out.println("この配列のSUMは" + sum);
	}

}
