package interface01;

/*
  不能通过接口【实现类】的对象来调用接口当中的静态方法!
  
  正确用法  通过接口名称 直接调用其中的静态方法 
  格式 接口名称.静态方法名（参数);
  静态和对象没有关系，和 类 有关系 
  
  */
public class Demo03Static {

	public static void main(String[] args) {
		// 静态和对象没有关系，和 类 有关系 ,所以new没有必要
		// Myinterface01Static m = new Myinterface01Static();
		// 直接调用静态方法中的方法，会报错 ，这是错误写法
		// m.nethodStatic();

		// 接口名称调用静态方法
		MyInterfaceStatic.methodStatic();

	}

}
