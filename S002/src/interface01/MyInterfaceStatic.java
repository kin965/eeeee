package interface01;
/*
  从java8开始  接口当中允许定义静态方法, 就是带着static，
  格式 
  public static 返回值类型 方法名称（参数列表）{
方法体  }
就是将 abstract或者default 换成static即可,并且带上方法体



  
  
  */
public interface MyInterfaceStatic {
	
	public static void methodStatic() {
		System.out.println("这是接口的静态方法");
	}

}
