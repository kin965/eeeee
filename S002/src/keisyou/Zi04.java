package keisyou;

public class Zi04 extends Fu04 {

	int num = 29;

	public void shoeNum() {
		int num = 19;

		System.out.println(num); // 19 局部变量
		System.out.println(this.num);// 29 本类
		System.out.println(super.num);// 30 来自父类
	}
	public static void show() {
		System.out.println("22");
	}

}
