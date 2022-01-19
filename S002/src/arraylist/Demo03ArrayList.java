package arraylist;

import java.util.ArrayList;

public class Demo03ArrayList {
	/*
	  arraylist常用的方法 
	  1 添加的方法 add public boolean add(E e)：向集合当中添加元素，参数类型和泛型一致
	  对于arraylist来说，添加的动作一定是成功的,所以返回值可用可不用 但是对于其他集合（今后学习）来说，add添加动作不一定成功。
	  返回值代表添加是否成功。 
	  2读取的方法（读取并非是拿出来，删除） public E get（int index）：从集合当中获取元素 参数是索引编号
	  3删除元素 public E remove（int index）：从集合当中删除元素 参数是索引编号 返回值就是被删除的元素 4获取集合的尺寸长度
	  public int size():获取集合的长度 返回值是集合中包含的元素个数
	  
	 
	  
	  
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		// add
		boolean sc = list.add("tony");
		System.out.println(list);
		System.out.println("動作は成功しますか" + sc);// 添加的动作是否成功
		list.add("wib");
		list.add("laki");
		list.add("bxq");
		list.add("zfl");
		
		//从集合中获取元素
		String name = list.get(2);
		System.out.println("二番インデックスの元素は"+name);
		
		//删除一个元素
		String remove=list.remove(3);
		System.out.println("削減した元素は"+remove);
		
		System.out.println(list);
		
		//获取长度尺寸 
		int size=list.size();
		System.out.println("この集合のサイズは"+size);
		
		
	}

}
