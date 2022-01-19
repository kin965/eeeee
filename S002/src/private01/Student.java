package private01;

public class Student {
	private String name;
	private int age;
	private boolean male;// 男性ですか？

	public void setMale(boolean b) {
		male = b;

	}

	public boolean isMale() {// boolean の特例（get＝＝＞is）
		return male;
	}

	public void setName(String str) {
		name = str;

	}

	public String getName() {
		return name;
	}

	public void setAge(int num) {
		age = num;

	}

	public int getAge() {
		return age;
	}
}
