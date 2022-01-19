package kin;

import java.util.Arrays;
//質問８︓バブルソート⽤メソッドを作成してください。
public class S6o8 {

	public static void main(String[] args) {
		int array[] = new int[] { 3, 2, 5, 1, 6, 9, 7, 8, 4 };

		int[] newA = bub(array);
		System.out.println(Arrays.toString(newA));
	}

	public static int[] bub(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] >array[j + 1]) {
					int t = array[j];
					array[j] = array[j + 1];
					array[j + 1] = t;
				}
			}
		}
		return array;

	}

}
