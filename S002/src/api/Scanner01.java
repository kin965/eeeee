package api;
//倒包
import java.util.Scanner;

public class Scanner01 {

	/*
	 * Scanner类的的功能 可以实现键盘输入数据，到键盘当中去 S是大写的 所以它是一个类 ，从JDK中来 引用类型的使用步骤 1倒包 import
	 * 包路径.类名称； 只有 Java.long包下的内容 不需要倒包，其他的包都需要import语句
	 * 
	 * 2创建 类名称 对象名 =new 类名称(参数)；
	 * 
	 * 3使用 对象名.成员方法名（参数）
	 * 
	 * 获取键盘上的一个int数字 ———》int num= sc.nextINt(); 获取字符串 String str =sc.next();
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// syetem in代表键盘输入
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("入力したデータは" + num);
		String name = sc.next();
		System.out.println("名前は" + name);
	}

}
