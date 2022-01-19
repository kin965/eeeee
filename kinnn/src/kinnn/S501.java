package kinnn;

public class S501 {
	// 設問１︓1から100までの偶数の和を求める(for + if)
	public static void main(String[] args) {
		// 初期のSUMの値を定義する．
		int sum = 0;
		// iを定義、１～１００までの数字を呼び出し．
		for (int i = 0; i <= 100; i++) {
			// 偶数をチェックする．
			if (i % 2 == 0) {
				// 偶数を和を求める
				sum = (sum + i);

			}

		}
		System.out.println("1から100までの偶数の和は" + sum);
	}

}
