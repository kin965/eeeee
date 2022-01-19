package private01;

/*
 构造方法 ，通过关键字new来创造对象时，就是在调用构造方法
 格式：
 public 类名称 （参数类型 参数名称）{
 方法体
 }
 注意事项
 1 构造方法名称需要和所在类名称完全一样,大小写也一样
 2构造方法不要写返回值类型 void也不写
 3构造方法不能return一个具体的返回值 
 4如果没有编写任何构造方法，编译器将会默认赠送一个构造方法
 没有参数，方法体什么事情都不做。
 5一旦编写了至少一个构造方法，编译器将不再赠送。
 6构造方法也是可以重载的。
 重载：方法名称相同，参数列表不同
 */
public class Gzff01 {
	// 成員変量
	private String name;
	private int age;

	// 引数なしの構造方法
	public Gzff01() {
		System.out.println("引数なしの構造方法はやっています");
	}

	// 引数があるの構造方法（）
	public Gzff01(String name, int age) {
		System.out.println("引数あるの構造方法がやっています");
		this.age = age;
		this.name = name;
	}

	// getter setter
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
