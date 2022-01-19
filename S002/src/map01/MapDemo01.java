package map01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {

	public static void main(String[] args) {
		// 创建一个map
		Map<String, Object> map = new HashMap<>();
		// 向里面添加元素，每次添加的都是一一对应的。（钥匙和对应的值）
		map.put("key1", "ドア");
		map.put("key2", "窓口");
		System.out.println(map);
		// 删除元素,钥匙被删除的同时，对应的值也被删除
		map.remove("key2");
		System.out.println(map);

		// 要素检索, 存在为true 不存在为false
		System.out.println(map.containsKey("key2"));
		// 取得要素
		System.out.println(map.get("key1"));

		// 空判断,空＝true/不空=false
		System.out.println(map.isEmpty());
   
		 
	}

}
