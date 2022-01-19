package arraylist;

import java.util.ArrayList;

/*
 数组的长度不可以发生改变
 但是arraylist 的长度可以随意变化
 
 对于arraylist来说 有个尖括号<E>代表泛型
 泛型也就是装在集合当中的所有元素，全都是统一的类型
 注意 泛型 只能是引用类型 不能是基本类型
 
 注意事项 
 对于arraylist来说 直接打印 得到的不是地址值 而是内容
 如果内容是空的 得到就是空的中括号
 
 
 
  */
public class Demo02ArrayList {

	public static void main(String[] args) {
//创建了一个arraylist集合,集合的名称是list 装的全是string类型的数据
		// 从jdk1.7开始,右侧的尖括号内部可以不写内容，但是尖括号本身还是要写的

		ArrayList<String> list = new ArrayList<>();
		System.out.println(list);

		// 向集合当中添加数据 需要用到add方法
		list.add("tony");

		list.add("wib");

		list.add("laki");

		list.add("syl");
		System.out.println(list);
	}

}
