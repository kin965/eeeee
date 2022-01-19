package override01;
/*
 此时 猫和狗吃的都是一样的，为了满足具体不同需要
 所以需要进行重写 
 现在需要去在 Cat 或Dog 的类中进行重写 
 */
public class Atexe01 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		Dog d = new Dog();
		d.eat();
		c.m1();//静的な方法  static 
	}
}
