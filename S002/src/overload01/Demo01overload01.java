package overload01;

//重载
/*
 对于功能类似的方法来说，因为参数列表不一样，却需要记住那么多不同的方法名称，太麻烦
 
 方法的重载（overload）多个方法的名称一样 但是参数列表不一样，
 
 好处 只需要记住唯一一个方法名称,那么就可以实现类似的多个功能
 
 
 
 
 */
public class Demo01overload01 {

	public static void main(String[] args) {
		/*
		 * System.out.println(sumTwo(10, 20)); System.out.println(sumThree(10, 20, 30));
		 * System.out.println(sumFour(10, 20, 30, 40));
		 */
		System.out.println(sum(10, 20, 30));

		System.out.println(sum(10, 20, 30));
		
		System.out.println(sum(10, 20, 30, 40));
         
		//System.out.println(sum(10,20,30,40,50));
		//会报错，因为找不到任何方法来匹配,所以错误
	}

	/*
	 * public static int sumTwo(int a, int b) { return a + b; }
	 * 
	 * public static int sumThree(int a, int b, int c) { return a + b + c; }
	 * 
	 * public static int sumFour(int a, int b, int c, int d) { return a + b + c + d;
	 * }
	 */
	public static int sum(int a, int b) {
		System.out.println("有两个参数的方法执行");
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		System.out.println("有3个参数的方法执行");
		return a + b + c;
	}

	public static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}

}
