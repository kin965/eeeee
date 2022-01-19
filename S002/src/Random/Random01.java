package Random;

import java.util.Random;

/*
 Random  随机的 
 
 用来生成随机数字 
 使用起来也是三个步骤
 1倒包
 
 2创建
 Random r = new Random();// 小括号里面留空即可
 
 3 使用
 获取一个随机数字（范围是int所有范围，有正负） int num ＝ r.nextInt()
 参数代表范围 左闭右开区间 
 例如  int num=r.nextInt(10)
 实际上代表的含义是 （0,10） 也就是 0到9.————类似于数组
 
 */
public class Random01 {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt();
		System.out.println(num);
	}

}
