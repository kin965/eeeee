package api;

import java.util.Scanner;

/*
 键盘输入两个数字求和
 
 
 
 
 
 */
public class Scannersum {
	public  static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("第一の数字を入力してください");
	int a =sc.nextInt();
	System.out.println("第二の数字を入力してください");
	int b =sc.nextInt();
	int c =a+b;
	System.out.println("その結果は"+c);
 	
	}
}
