package kinnn;

public class S506 {
	// 質問６︓任意⾏列（２次元配列）の積を求める。
	public static void main(String[] args) {

		// 最初のPLUSを定義(積算のため、０を定義できない)
		int plus = 1;
		// 次元配列

		int[][] array = new int[][] {
				// 一組
				{ 1, 2, 3, 4 },
				// 二組
				{ 5, 6, 7, 8 } };
		// 一組と二組の根を取る
		for (int i = 0; i < array.length; i++) {

			// 一組と二組の要素を取る
			for (int j = 0; j < array[i].length; j++) {
				// 一組と二組のPLUS値を取る（二つfor循環、各要素は積算ので）

				plus = (plus * array[i][j]);

			}

		}

		System.out.println("この次元配列の積算の値は" + plus);

	}

}
