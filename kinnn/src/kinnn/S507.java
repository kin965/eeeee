package kinnn;

public class S507 {
//質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
	public static void main(String[] args) {
		// まずは配列の値を定義する
		int array[] = new int[] { 5, 4, 6, 3, 7, 2, 1 };
		// 一回目のfor循環、配列の値を求める
		for (int i = 0; i < array.length; i++) {
			// 内のfor循環で，インデックスの起点の値と右側の値を対比する，大きい方は後ろ（右側）に移動する
			// それに対して．小さい方は左側に移動する
			// そして、インデックス（ｊ）と（ｊ＋１）対比ので，その（j+1）最大値は配列のlengthを超えない．
			for (int j = 0; j < array.length - 1; j++) {
				// 起点の値が大きいなら，その値と右側の値を交換する．
				if (array[j] > array[j + 1]) {
					// 今[j][j+]の中には値がある，直接に交換できない
					// 直接に交換はできないので，まずはarray[j]の値を借りたint t に入る
					int t = array[j];
					// 今array[j]に値がないから，[ｊ+１]の値を[j]に入れる．
					array[j] = array[j + 1];
					// 最後，借りた ing tから、[j+1]の値を返還する．
					array[j + 1] = t;

				}
			}

		}
		System.out.print("この配列を昇順でソートしたの結果は");
		// 今はこの配列のインデックスと要素の値の関係が変わった，新しいインデックスと値関係を呼び出す．
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
}
