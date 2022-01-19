package pub001;

public class TestDog {
	public static void main(String args[]) {
		Animal a = new Animal(); // Animal 对象
		Animal b = new Dog(); // Dog 对象
		Animal c = new Dog();
		Animal d = new Animal();

		a.move();// 执行 Animal 类的方法

		b.move();// 执行 Dog 类的方法

		c.bark();

		d.bark();

	}
}
