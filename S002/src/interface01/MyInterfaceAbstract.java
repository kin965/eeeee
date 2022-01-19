package interface01;
/*
 再任何版本的java中 接口都能定义 抽象方法 
 
 public abstract 返回值类型 方法名称(参数列表)；
 
 注意事项 
 1 接口当中的抽象方法 修饰符必须是两个固定的关键字
 public abstract 
 2这两个关键字修饰符 可以选择性的省略
 3方法的三要素可以随意定义 
 
 
 */
public interface MyInterfaceAbstract {
	//这是一个抽象方法 
	public abstract void methodAbs1();
	
	 void methodAbs2();
	
	 public  void methodAbs3();
	 
	 void methodAbs();
	 //以上全是抽象方法（正确的写法）
	 

}
