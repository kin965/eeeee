package Random;

import java.util.Random;
import java.util.Scanner;

public class Demo04Random {
	/*
	 * 猜数字 用代码模拟猜数字的小游戏 思路 1.首先需要产生一个随机数字 并且一旦产生 不再变化 用 Random的nextint方法 2.需要键盘输入
	 * 所以用到了 scanner 3获取键盘输入的数字 用 scanner 当中的 nextint方法 4.已经得到了两个数字，判断（if）一下 三种情况
	 * 如果太大了 提示太大 并且重试 小了 提示 小 重试 猜中 游戏结束。 5重试 就是再来一次 循环次数不确定 用while (true)
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random r = new Random();
		int rnum = r.nextInt(100) + 1;

		Scanner sc = new Scanner(System.in);

		while (true) {//如果只给固定次数的机会，用for循环来做更合适
			System.out.println("あなた考えた数字を入力して");
			int gnum = sc.nextInt();// 键盘输入猜测的数字

			
			if (gnum > rnum) {
				System.out.println("数字が大きい、もう一度入力して");
			} else if (gnum < rnum) {
				System.out.println("数字が小さい、もう一度入力して");
			} else {
				System.out.println("おめでとうございます．当たります");
				break;// 如果猜中 不再重试
			}
		}
		System.out.println("game over");
	}

}
