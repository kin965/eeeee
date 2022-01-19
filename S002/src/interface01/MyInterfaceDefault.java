package interface01;
/*
 从java8 开始 接口里允许定义默认方法
 格式
 public defaul 返回值类型 方法名称（参数列表）{
 方法体}
 
 备注 接口当中的默认方法可以解决接口升级的问题
 接口升级：一个接口正在被使用，中途将接口内容修改，
 根据规则，实现规则的类需要覆盖重写接口的全部方法，
 此时在使用这个接口的其他类就会报错，为了解决这个问题。
 就需要用到 默认方法 default
 
 
  
  */
public interface MyInterfaceDefault {
	
	//原有的方法，在这被其他类使用
	public abstract void methodAbs();
	
	//新添加的方法 ，会导致其他程序报错
	//public abstract void methodAbs2();
	
     //新添加的方法，改成默认方法
	public default void methodAbs3() {
	//注意这里面需要写大括号 	
		System.out.println("这是一个接口的默认方法");
	}
	
}
