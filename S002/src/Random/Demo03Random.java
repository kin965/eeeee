package Random;

import java.util.Random;

public class Demo03Random {
	/*
	 * 根据int变量n的值，来获取随机数字 范围是1到n 可以取1 也可以取n 1，定义一个变量n，随意赋值 2使用Random 3如果写10 那么就是0到9
	 * 然而想要的是1到10， 可以发现 整体加1即可。
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int n = 5;
		Random r = new Random();
		for (int i = 0; i < 100; i++) {

			int result = r.nextInt(n) + 1;

			System.out.println(result);
		}

	}

}
