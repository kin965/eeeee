package kinnn;

public class S6001 {

	public static void main(String[] args) {
		//各組の計算方法を呼び出し
		int[] array = new int[] { 2, 4, 6, 8, 10 };
		int min = cheakMin(array);
		System.out.print(min);

	}

	public static int ckeakMax(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}

		}
		return max;
	}

	public static int cheakMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

}