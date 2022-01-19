package rensyu09;

public class Cat {
	public static void main(String[] args) {
		Animal cat = new Animal(null);
		cat.sayHello();
		cat.setName("tony");
		System.out.println(cat.getName());

		System.out.println(new Animal("cat").getName());
	}
}
