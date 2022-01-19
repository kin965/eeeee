package dai10kai;

public class Mondai04 {
	public static void main(String[] args) {
		String value = "abced12345あいうえお１２３４５";
		Mondai04.nullOrEmpty(value);
	}

	public static boolean nullOrEmpty(String value) {
		System.out.println(value.isEmpty());
		return false;

	}
}
