package tokumei;

public class Tokumei01 {
/*
  创建对象的标准名称 
  类名称 对象名 =new 类名称（）
  
  匿名对象就是只有右边的对象，没有左边的名字和赋值语句 赋值运算符
  格式 
  new 类名称（）； 
  匿名对象只能使用唯一的一次， 下次再用不得不再创建一个新对象
  
 */
	public static void main(String[]arge) {
		
		People one =new People();
		one.name ="liki";
		one.showName();
		System.out.println("================");
		new People().name="tony";
		new People().showName();//null
	}
}
