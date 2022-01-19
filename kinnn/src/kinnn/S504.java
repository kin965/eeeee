package kinnn;

public class S504 {
	// 質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
	public static void main(String[] args) {
		// 配列を定義する．
		int array[] = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		// 第一回for循環，配列の値を求める
		for (int i = 0; i < array.length; i++) {
			// 重複の回数の値を初期化
			int jf = 0;
			// 第二回for循環
			for (int j = 0; j < array.length; j++) {
				// 重複の要素を取る．
				if (array[i] == array[j]) {
					// 重複の回数を求める
					jf++;
				}
			}
			// 重複の回数＞＝２の時に，要素は重複が分かれる
			if (jf >= 2) {
				// 重複の要素を呼び出し
				System.out.println("この配列の重複の要素は" + array[i]);
			}
		}
	}
}
