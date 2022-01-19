package kin;

public class H003 {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 3, 5, 7, 100, 0, 1 };
		int sum = 0;
		for (int a = 0; a < array.length; a++) {
			if (sum < array[a]) {
				sum = a;
			} else if (sum > a) {
				sum = sum;
			}
			System.out.println(sum);

		}

	}

}
