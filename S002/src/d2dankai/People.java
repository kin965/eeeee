package d2dankai;

public class People {
	String name;
	private int age;

	public void show() {
		System.out.println("私は" + name + "今年は" + age + "歳");
	}

	public void setAge(int num) {

		if (num < 100 && num >= 0) {
			age = num;
		} else {
			System.out.println("入力したデータは錯誤");
		}
	}

	public int gatAge() {
		return age;
	}
}
