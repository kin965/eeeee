package stringDemo;

/*
 字符串的截取方法
 public String substring(int index);截取从参数位置一直到字符串末尾，返回字符串
 public String substring(int begin,int end);截取一个范围
 左闭右开区间，包含左边不包含右边。
  */
public class Demo03 {
	public static void main(String[] args) {
		String str1 = "HelloWorld";
		String str2 = str1.substring(5);
		System.out.println(str2);
		String str3 = str1.substring(6, str1.length() - 1);
		System.out.println(str3);
	}

}
