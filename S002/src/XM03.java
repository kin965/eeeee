
public class XM03 {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int min = cheakMin(arr);
		int max = cheakMax(arr);
		int sum = cheakSum(arr);
		double hk = cheakHk(arr);
		System.out.println(min + "\t" + max + "\t" + sum + "\t" + hk);

	}

	public static int cheakMin(int[] arr) {
		int max = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int cheakMax(int[] arr) {
		int min = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int cheakSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i] + sum;
		}
		return sum;
	}

	public static double cheakHk(int[] arr) {
		double hk = 0.0;
		for (int i = 0; i < arr.length; i++) {
			hk = (arr[i] + hk);

		}
		hk = hk / arr.length;
		return hk;
	}
}
