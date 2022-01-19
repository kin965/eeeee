package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo01 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		// 添加要素
		list1.add("a");
		list1.add("b");
		// 删除要素
		list1.remove(0);
		// 检索要素
		// 检索要素之是否存在
		System.out.println(list1.contains("b"));// true
		// 检索要素之存在的位置的下标
		System.out.println(list1.indexOf("b"));// インデックス 0
		// 取得要素
		System.out.println(list1.get(0));// b
        
		
		//List TO 配列
		List<String> list = new ArrayList<>();
		list.add("item 1");
		String[] datas = list.toArray(new String[0]);
		
		
		//配列 TO List
		String[] datas1 = new String[]{"item1", "item2", "item3"};
		 List<String> list2 = Arrays.asList(datas1);
		 
		 

	}

}
