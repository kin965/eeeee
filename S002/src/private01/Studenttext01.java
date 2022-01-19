package private01;

public class Studenttext01 {

	public static void main(String[] args) {
		Studenttext student = new Studenttext();
		student.setName("laki");
		student.setAge(20);
		System.out.println("姓名は" + student.getName() + "年齢は" + student.getAge());
		Studenttext student2 = new Studenttext("tony", 22);
		System.out.println("姓名は" + student2.getName() + "年齢は" + student2.getAge());
	}

}
