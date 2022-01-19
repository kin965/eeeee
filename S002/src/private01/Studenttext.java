package private01;

//標準のclass*（类）
/*
 一个标准的类 通常需要满足四个组成部分
 
 1所有的成员变量都需要使用private关键字修饰
 2为每一个成员变量编写一对get set方法
 3编写一个无参数的构造方法
 4编写一个全参数的构造方法
 
 标准的类也叫做 java Bean
 */
public class Studenttext {
	private String name;
	private int age;

	public Studenttext() {
	}

	public Studenttext(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
