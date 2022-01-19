package kin;

public class S601 {
    //二つ配列を相加の方法
	public static void main(String[] args) {
		int left[] = new int[] { 1, 2, 3, 4 };
		int right[] = new int[] { 5, 6, 7, 8 };
		// System.out.println(left.length);
		int res[] = new int[(left.length) + (right.length)];
		// System.out.println(res.length);
		for (int i = 0; i < left.length; i++) {
			res[i] = left[i];
			// System.out.println(res[i]);
		}
		for (int j = 0; j < right.length; j++) {
			res[left.length + j] = right[j];
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
