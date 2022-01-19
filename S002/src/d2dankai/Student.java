package d2dankai;


	/*
	 学生を定義する
	 1属性
	 年齢 姓名
	 2行為
	  食べる
	  寝る
	  学習
	 ＝＝＞Javaのpublicに相応しい
	 属性（成員変量）
	 String name
	 int age
	 行為（成員方法）＝＝＞ 成員方法を書くときに static はない
	 public  viod eat(){}==>食べる
	 public  viod sleep(){}==>寝る
	 public  viod study(){}==>学習
	 
	 
	   */
public class Student {
	//成員変量
	String name;
	int age;
	//成員方法
    public void eat() {
	System.out.println("食べる");
	}
    public void sleep() {
    	System.out.println("寝る");
    }
	public void study() {
		System.out.println("学習");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
