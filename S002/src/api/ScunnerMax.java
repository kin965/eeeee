package api;

import java.util.Scanner;

public class ScunnerMax {

	public static void main(String[] args) {
		// 最大値を求める

		Scanner sc = new Scanner(System.in);
		System.out.println("第一の数字を入力してください");
		int a = sc.nextInt();
		System.out.println("第二の数字を入力してください");
		int b = sc.nextInt();
		System.out.println("第三の数字を入力してください");
		int c = sc.nextInt();
        
		int temp = a>b?a:b;
		int max = temp>c?temp:c;
		
		System.out.println("最大値は"+max);
	}

}
