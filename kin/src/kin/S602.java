package kin;

import java.util.Arrays;

public class S602 {
     //二つ配列を合併する
	public static void main(String[] args) {
		int left[] = new int[] { 1, 2, 3, 4 };
		int right[] = new int[] { 5, 6, 7, 8 };
		// 配列の結果を呼び出し
		int[] res = kapei(left, right);
		// Array.toSttringを使って、配列の各要素の値を出力
		System.out.println(Arrays.toString(res));
		
	}

	// 上の配列を使って、関数に入れる
	public static int[] kapei(int[] left, int[] right) {
		// 新しい配列の値を確定（配列1と配列2のlengthを相加）
		int[] res = new int[(left.length) + (right.length)];
		// まずはleft配列の値を新しい配列に入れる
		for (int i = 0; i < left.length; i++) {
			res[i] = left[i];
			// System.out.println(res[i]);
		}
		// right配列の値を新しい配列に入れる
		for (int j = 0; j < right.length; j++) {
			res[left.length + j] = right[j];
		}
		// 新しい配列の各要素の値を確定
		for (int i = 0; i < res.length; i++) {
			// System.out.println(res[i]);

		}
		// 関数の結果を主メソッドに返還する
		return res;
	}

}
