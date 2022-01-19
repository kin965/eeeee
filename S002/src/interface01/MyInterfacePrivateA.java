package interface01;

/*我们需要抽取一个公共方法 用来解决多个默认方法之间重复代码的问题
但是这个公共方法 不应该让 实现类使用，应该是私有化的。

解决方案：
从java9开始 接口当中 允许定义私有方法 
两种
1普通私有方法，解决多个默认方法之间重复代码问题
格式 
private 返回值类型 方法名称（参数列表）{
方法体}
2静态私有方法 ,解决多个静态方法之间重复代码问题
格式 private static  返回值类型 方法名称（参数列表）{
方法体}
*/
public interface MyInterfacePrivateA {

	public default void methodDefaule1() {
		System.out.println("黙然方法１");
		methodCommon();
		// System.out.println("aaa");
		// System.out.println("bbb");
		// System.out.println("ccc");
	}

	// 此时 默认方法1和默认方法2存在大量重复内容
	public default void methodDefaule2() {
		System.out.println("黙然方法2");
		methodCommon();
		// System.out.println("aaa");
		// System.out.println("bbb");
		// System.out.println("ccc");
	}

	// 再定义一个方法，让其他方法来调用它（Common）
	public default void methodCommon() {
		System.out.println("aaa");
		System.out.println("bbb");
		System.out.println("ccc");
	}

}
