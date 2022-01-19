package dai10kai;

public class Pet {
	enum anmil {
		cat, dog;
	}

	private String name;
	private int age;

	public Pet() {
		
	}

	public Pet(String name, int age) {

	}
	public void  showName() {
		System.out.println("name");
	}
	public void showAge() {
		System.out.println(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
