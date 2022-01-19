package kin;

public class H005 {

	public static void main(String[] args) {
		//
		int min = Integer.MIN_VALUE;
		// 最小値
		int max = Integer.MAX_VALUE;
		// 最大値
		int[] array = new int[] { 1, 3, 5, 7, -100, 0, 1 };
		// 配列
		for (int i = 0; i < array.length; i++) {
			// 最小値を取る
			if (max > array[i]) {
				max = array[i];
			}
			// 最大値を取る
			if (min < array[i]) {
				min = array[i];

			}

		}
		System.out.println("この配列の最小値は" + max);
		System.out.println("この配列の最大値は" + min);

	}

}
