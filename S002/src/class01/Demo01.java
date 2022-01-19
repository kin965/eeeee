package class01;

//dogとcat の年齢
public class Demo01 {

	public static void main(String[] args) {
		Cat01 cat1 = new Cat01();
		cat1.name = "cat";
		cat1.age = 2;
		Dog01 dog1 = new Dog01();
		dog1.name1 = "dog";
		dog1.age1 = 5;
		System.out.println(cat1.name + "の年齢は" + cat1.age + "歳" + dog1.name1 + "の年齢は" + dog1.age1 + "歳");
	}

}
