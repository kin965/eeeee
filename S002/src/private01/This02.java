package private01;

public class This02 {
	String name;
	// who =相手の名前
	// name =自分の名前

	/*
	 * 方法の局部変量と成員変量の名前が同じときに、局部変量が優先的に使う．， 本classの成員変量を使いたいときに「this.」が必要だ． 使う方法は＝＝＞
	 * this.局部成員変量名前
	通过谁调用的方法，谁就是this.
	 */
	
	public void sayHello(String name) {
		System.out.println(name /* who */ + "こんにちは,わたしは" + this.name);

	}

}
