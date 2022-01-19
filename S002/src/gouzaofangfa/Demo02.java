package gouzaofangfa;

public class Demo02 {

	public static void main(String[] args) {
		Student stu = new Student();// new对象 就是在调用构造方法
		// 小括号里面留空 调用的就是无参数构造方法

		// stu.M1();//点 什么的时候 是在调用构造方法里面的东西

		Student stu2 = new Student("liki", 20);
		// 小括号里面写上对应参数 就调用的有参数构造

		System.out.println(stu2.getName() + "" + stu2.getAge());
		stu2.setAge(22);// 改变年龄
		System.out.println(stu2.getAge());

		// stu2.M1(); 可以通过任意构造方法 调用其中的东西

	}

}
