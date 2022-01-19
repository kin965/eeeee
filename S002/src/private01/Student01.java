package private01;

public class Student01 {
 public  static void main(String[]args) {

	 Student jh =new Student();
	 jh.setAge(18);
	 jh.setName("ib");
	 jh.setMale(true);
	 
	 System.out.println("名前は"+jh.getName());
	 System.out.println("今年は"+jh.getAge()+"歳");
	 System.out.println("男性ですか"+jh.isMale());
	 
 }

}
