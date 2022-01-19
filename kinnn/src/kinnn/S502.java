package kinnn;

public class S502 {
	// 設問２︓5の階乗を求める(for)。
	public static void main(String[] args) {
		// PLUSの初期値を設定する．
		int plus = 1;
		// 配列の値設定する．
		int array[] = new int[] { 1, 2, 3, 4, 5 };
		// ++を使って，配列の具体的値を呼び出し．
		for (int i = 0; i < array.length; i++) {
			// 具体的値一つづつ掛け算する．
			plus = (array[i] * plus);

		}
		System.out.print("5の階乗の結果は" + plus);

	}

}
