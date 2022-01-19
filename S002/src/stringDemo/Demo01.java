package stringDemo;
//常见的字符串方法

/*
 == 是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法
 
 public boolean equals（Object obj）参数可以是任何对象，只有参数是一个字符串且内容相同时才会给true 否则返回false
 备注：任何对象都能用object来进行接受。
 
 另一个方法 忽略大小写 内容进行比较
 public boolean equalsIgmoreCase（String str）；
 
  */

public class Demo01 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		char[] charArray = { 'h', 'e', 'l', 'l', 'o' };
		String str3 = new String(charArray);

		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));

		String stra = "Java";
		String strb = "jAvA";
		// 忽略大小写
		System.out.println(stra.equalsIgnoreCase(strb));

	}

}
