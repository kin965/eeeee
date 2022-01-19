package override01;
/*
 当父类中的方法 无法满足子类中的需求的时候，子类可以将父类的方法进行重写
 
 必要的条件 
 1 两个类必须是继承关系
 2子类重写父类的方法  方法名必须和父类是一样的
 返回值类型一样 参数列表一样
 3重写的方法不能比被重新的方法拥有更低的访问权限
 
 4私有的方法不能被重写
 5构造方法不能被重新，因为构造方法不能被继承
 6静态方法不存在重写
 7重写指的是成员方法 和成员变量无关 
 */
public class Demo01override {

	public void eat() {
		System.out.println("食べる");
	}
	public void sleep() {
		System.out.println("寝る");
		
	}
	public static void m1() {
		System.out.println("静的な方法");
	}

}
