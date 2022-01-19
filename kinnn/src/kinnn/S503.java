package kinnn;

public class S503 {
	// 質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
	public static void main(String[] args) {
		// 基本配列を配布
		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		// 一組を呼び出し．
		int max = cheakMin(array);
		// 二組を呼び出し．
		System.out.println("この配列の最小値は" + max);
		int min = cheakMax(array);
		// 三組を呼び出し
		System.out.println("この配列の最大値は" + min);
		int sum = sumTl(array);
		// 四組を呼び出し．
		System.out.println("この配列のSUMは" + sum);
		double hikin = hiKin(array);

		System.out.println("この配列の平均値は" + hikin);

	}

	// 新しい組を作る
	public static int cheakMin(int[] array) {
		// 最大値を取る
		int max = Integer.MAX_VALUE;
		// forの時に，IFを使って、小さい方の値を取る
		for (int i = 0; i < array.length; i++) {
			if (array[i] < max) {
				max = array[i];
			}

		} // 取った値を最初のクラスに送る
		return max;

	}

	// 最大値の取る方法は一組の最小値の取る方法と同じ．違いところはminの値はintの最小値．
	// そして、iとmin対比時に，大きい方はminの値．
	public static int cheakMax(int[] array) {

		int min = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > min) {
				min = array[i];
			}
		}
		return min;
	}

	// 三組を作る
	public static int sumTl(int[] array) {
		// 最初のsumの値を定義する．
		int sum = 0;
		// forの時に，sumの値は古い値と新しい値を相加する．最後の値を取る
		for (int i = 0; i < array.length; i++) {
			sum = (array[i] + sum);

		} // 取った値を最初のクラスに送る
		return sum;

	}

	// 四組を作る
	public static double hiKin(int[] array) {
		// double hikin の値を定義する．
		double hikin = 0;
		// forを使って、まずはこの配列の和を取る．
		for (int i = 0; i < array.length; i++) {
			hikin = (array[i] + hikin);
		}
		// この配列の和と配列のインデックスの数量割り算をする．
		hikin = (hikin / array.length);
		// 取った値を最初のクラスに送る
		return hikin;

	}
}
