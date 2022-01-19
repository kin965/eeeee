package reigai01;

public class TryDemo01 {

	public static void main(String[] args) {
		int i = 10;
		try {
			System.out.println(20 / 0);
		} catch (ArithmeticException e) {
			System.out.println("エラーを発生します");
		}
		try {
			TryDemo01.tryAndCatch();
			// Exception 是固定写法，前面取决于不同的错误种类。
		} catch (ArithmeticException e) {
			System.out.println("エラー");
		}
	}

	public static int tryAndCatch() {
		int j = 10;
		int k = j;
		int f = (j - k) / 0;
		return f;

	}

}
