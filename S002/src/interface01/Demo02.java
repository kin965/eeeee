package interface01;
/*
 1接口的默认方法 可以通过（实现类）对象 ，直接调用
 2接口的默认方法，也可以被接口（实现类）覆盖重写
 
  */
public class Demo02 {
public static void main(String []args){
	Demo01 d = new Demo01();
	d.methodAbs();
	
	//实现类（demo01）中其实并没有这个方法，但是依然可以被调用
	//这是因为在实现类中没有的方法 会向上找到接口（MyInterfaceDefault）
	
	d.methodAbs3();
	
	
	
}
}
