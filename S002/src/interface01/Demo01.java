package interface01;

public class Demo01 implements MyInterfaceDefault {

	@Override
	public void methodAbs() {
     System.out.println("实现了抽象方法");	
     
     
     
	}
	//现在是覆盖重写默认方法,这样也是可以的
	 /*
	 public void methodAbs3() {
	syso("重写默认方法")	
	}
	*/
	

}
