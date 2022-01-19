package d2dankai;

/*
  通常情况下 一个类并不能直接使用，需要根据类创建一个[对象] 才能使用
   1倒包
   指出需要使用的类，在什么位置
   格式： import 包名称，类名称；
   同一个包的类，可以省略倒包语句
   2创建
   格式 类名称 对象名 = new类名称();
   Student stu = new Student();
   
   3使用：分为两种情况 
   使用成员变量 对象名.成员变量名
   使用成员方法 对象名.成员方法名 (参数)
   
   
   
  */
public class Student02 {
	public static void main(String[] args) {
		Student stu = new Student();

		stu.age = 20;
		stu.name = "tony";
		System.out.println(stu.age);
		System.out.println(stu.name);

		stu.eat();
		stu.sleep();
		stu.study();

	}
}
