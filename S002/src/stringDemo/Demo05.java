package stringDemo;

//字符串的分割方法
/*
 public String[] split(String regex);按照參數的規則，将字符串分成为若干份
 
  */
public class Demo05 {

	public static void main(String[] args) {
		String str1 = "aaa,bbb,ccc";
		String[] array1 = str1.split(",");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}

	}

}
