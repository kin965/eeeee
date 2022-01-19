package employee01;
//抽象
/*
 抽象方法 
 就是加上 abstract 关键字 然后去掉大括号 直接分号结束

 抽象类 抽象方法所在的类 必须是抽象类才行 
 就是在class之前 写上abstract即可 
 
 如何使用抽象类 和抽象方法
 1不能直接创建 new抽象类对象 。
 2必须 用一个子类来继承抽象父类 
 3子类必须覆盖重写抽象父类中所有的抽象方法
 覆盖重新（实现），也就是去掉抽象方法的abstract关键字，然后补上方法体 大括号
 4创建子类对象 进行使用 
 */
public abstract class Animal {
	//这就是 一个抽象方法 代表在吃东西 但是具体吃什么 不确定
	public abstract void eat();
	
	public /*abstract*/ void normaMethod() {
		
	}
	

}
