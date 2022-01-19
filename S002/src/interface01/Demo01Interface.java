package interface01;
/*
 代码当中 接口就是多个类的公共规范 
 但是接口是一个引用数据类型
接口最重要的就是其中的抽象方法

 定义一个接口 
 public interface 接口名称 {
 接口内容
 }
 
 备注：编译生成的字节码文件 仍然是.class 

 如果是java7  可以包含的内容有
 1常量 
 2抽象方法
 如果是java8 还可以额外包含有 
 3默认方法
 4静态方法
 如果是java9 还可以包含
 5私有方法
 
 接口使用的步骤
 1接口不能直接使用，必须有一个实现类 来实现接口（类似于子类继承）
 格式 
 public class 实现类名称 implements 接口名称{
  }
 2接口它的实现类 必须覆盖重写（实现）接口中所有的抽象方法
 实现（覆盖重写）：去掉abstract关键字 加上方法体大括号
 3创建实现类的对线，进行使用
 
 
 注意事项 
 如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类。
 
 */

public class Demo01Interface {
	
	public static void main(String []args) {
		//错误写法 不能直接new接口
	
		//MyInterfaceAbstract m= new MyInterfaceAbstract();
		//创建实现类的对线使用
		
		MyInterfaceAbstractImpl m = new MyInterfaceAbstractImpl();
		m.methodAbs();
		m.methodAbs1();
		
	}

}
