package private01;

public class Gzff02 {
	public static void main(String[] args) {
		Gzff01 gzff1 = new Gzff01();// 引数なしの構造

		Gzff01 gzff2 = new Gzff01("liki", 20);// 引数があるの構造
		System.out.println("名前は" + gzff2.getName() + "年齢は" + gzff2.getAge() + "歳");
		// データの内容を変更したいときに、set,get方法が必要
		gzff2.setAge(22);// 年齢を変更
		System.out.println("変更した後の年齢は" + gzff2.getAge());
	}

}
