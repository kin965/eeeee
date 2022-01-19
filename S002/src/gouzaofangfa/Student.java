package gouzaofangfa;

/*
 构造方法是专门用来创建对象的方法
 当我们通过关键字new来创建对象时其实就是在调用构造方法
 
 格式
  public  类名称 (参数类型 参数名称 多个的时候用逗号连接){方法体}
 
 注意事项
 1构造方法名称 必须和所在类名称完全一样
 2构造方法不要写返回值类型 void 也不写
 3 构造方法不能 return 一个具体的返回值 
 4 如果没有编写任何构造方法 编译器将会默认赠送一个构造方法
 方法体 什么都不做 所以没写构造方法的时候 直接调用的是默认的构造方法
 5一旦编写了至少一个构造方法 编译器将不再赠送
 6构造方法也是可以进行重载的
 重载：方法名称相同  参数列表不同 
 
  */
public class Student {
	private String name;
	private int age;

	public Student() {
		System.out.println("默认无参构造方法执行了");
		// return 不可以
	}

	public Student(String name, int age) {
		System.out.println("有参数构造方法执行了");
		this.name = name;
		this.age = age;
	}

	public void M1() {
		System.out.println("111222");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

}
