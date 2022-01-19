package stringDemo;

//字符串的转变
/*
 String 当中与转换相关的常用方法有：
 public char[]tochararray();将当前字符串拆分成为字符数组作为返回值。
 public byte[]getBytes（）；获得当前字符串底层的字节数据
 public String replace(CharSequence oldString,CharSequence newString)；
 将所有出现的老字符串替换成为新的字符串，返回替换之后的结果是新字符串
  */
public class Demo04 {
	public static void main(String[] arge) {
		// 转换成为字符数组
		char[] chars = "hello".toCharArray();
		System.out.println(chars[0]);
		System.out.println(chars[2]);

		// 转换成为字节数组
		byte[] bytes = "abcdes".getBytes();
		System.out.println(bytes[0]);
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		// 替換字符串
		String str1 = "how do you do?";
		String str2 = str1.replace("o", "e");
		System.out.println(str2);
	}

}
