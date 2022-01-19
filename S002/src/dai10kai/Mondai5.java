package dai10kai;

public class Mondai5 {
	public static void main(String[] args) {

		float one = 12345.987654F;
		// one=123,456 two=123,457.00
		/*
		 * 1. 浮動⼩数点数 2. ⻑さは5桁数 3. 精度は⼩数点後2位
		 */
		System.out.println(String.format("one=%,.2f", one));
       
	}
}
