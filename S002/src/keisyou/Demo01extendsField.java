package keisyou;
/*在父子类的继承关系当中，如果成员变量重名。
则创建子类对象时 访问有两种方式

直接通过子类对象访问成员变量 
 等号左边是谁 就优先用谁 没有则向上找 

间接通过成员方法 访问成员变量
方法属于谁 就优先用谁 ，没有则向上找 
*/
public class Demo01extendsField {

	public static void main(String[] args) {

		Fu fu = new Fu();
		Zi zi = new Zi();

		// System.out.println(fu.num1);
		// System.out.println(zi.num2);
		
		
		System.out.println(zi.num);//直接访问
		
		
		System.out.println();//间接访问
        
		zi.methodZi();
		zi.methodFu();//这个方法是在父类中定义的
		
		
	}

}
