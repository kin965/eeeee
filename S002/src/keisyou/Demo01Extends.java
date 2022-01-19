package keisyou;
/*
 继承的关系中，子类 就是一个父类 子类可以被当作父类看待
 定义父类的格式 就是普通的类定义
 
 public class 父类名称....
 
 定义子类的格式
 
 public class 子类名称 extends 父类名称 
 
 
 
 */
public class Demo01Extends {

	public static void main(String [] args) {
	//创建了一个子类对象
		Teacher teacher =new Teacher();
		//teacher当中虽然是空的，什么都没写，但是它继承了父类里面的方法
		teacher.method();
		//创建另一个子类对象
		Assistant assistant=new Assistant();
		assistant.method();
		
		
	
		
	}
	

}
