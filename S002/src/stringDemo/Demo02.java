package stringDemo;

/*与获取相关的方法
  public int Length();获取字符串当中含有的字符个数,
  public String concat（String str）;将当前字符串和参数字符串拼接成为返回值新的字符串
  public char charAt(int index)获取指定指引位置的单个字符
  public int indexOf（String str）查找参数字符串在本字符串当中首次出现索引位置,如果没有，就返回-1值
  
 */
public class Demo02 {
	public static void main(String[] args) {
		// 获取长度
		int lenght = "asfgrtehgfhgfhgf".length();
		System.out.println(lenght);
		// 拼接字符串
		String str1 = "hello";
		String str2 = "world";
		String str3 = str1.concat(str2);
		System.out.println(str3);

		// 获取指定索引位置的单个字符
		char ch = "hello".charAt(1);
		System.out.println(ch);

		// 查找小字符串 在大字符串当中第一次索引位置
		String or = "HelloWorld";
		int o = or.indexOf("llo");
		System.out.println(o);
	}

}
