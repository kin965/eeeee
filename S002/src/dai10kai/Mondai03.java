package dai10kai;

public class Mondai03 {

	public static void main(String[] args) {
		String value = "abced12345あいうえお１２３４５";
		int length = value.length();
		System.out.println("この文字列の長さは" + length);

		byte[] bytes = value.getBytes();
		System.out.print("この文字列のバイト数は" + bytes.length);

	}
}
