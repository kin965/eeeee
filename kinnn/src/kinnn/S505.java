package kinnn;

public class S505 {
	// 質問５︓質問３の配列に値「７」のインデックスを求む。
	public static void main(String[] args) {
		// 配列の値を定義
		int array[] = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		// 配列の各要素の値とインデックスを求める
		for (int i = 0; i < array.length; i++) {
			// 要素「７」と先求めた値がイコル時に，そのインデックスを呼び出す
			if (array[i] == 7)
				System.out.println("この配列に値「７」のインデックスは" + i);
		}
	}

}
