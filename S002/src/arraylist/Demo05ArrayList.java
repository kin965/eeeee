package arraylist;

import java.util.ArrayList;

/*
  如果希望向集合ArrayList当中储存基本类型数据，必须使用基本类型对应的包装类。
  包装类 
  基本类型 包装类（引用类型 包装类都位于java.long包下）
  byte   Byte
  short  Short
  int    Integer
  long   Long
  float  Float
  double Double
  char   Charater
  boolean Boolean
  (首字母变成大写， 除了char和int类型是特殊的)
  
  从jdk1.5开始 支持自动装箱 自动拆箱
  装箱 ： 基本类型 自动变成 引用类型(包装类型)
  拆箱 ： 包装类型 自动变成 基本类型 
 
 */
public class Demo05ArrayList {

	public static void main(String[] args) {
		ArrayList<String> listA = new ArrayList<>();

		ArrayList<Integer> listc = new ArrayList<>();
		listc.add(100);
		listc.add(50);

		int a = listc.get(1);
		System.out.println("一番目の元素は"+a);
	}

}
