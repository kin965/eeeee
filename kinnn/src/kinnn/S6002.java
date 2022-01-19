package kinnn;

import java.util.Arrays;
//面向对象 面向方法
public class S6002 {
	public static void main(String[] args) {

		int[] array = new int[] { 10, 20, 30, 40, 50 };
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i] + "]");
			} else {
				System.out.print(array[i] + ",");
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
