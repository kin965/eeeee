package d2dankai;

public class Phone {

	String brand;
	double price;
	String color;

	public void call(String who) {
		System.out.println("掛ける" + who);
	}

	public void sendMessage() {
		System.out.println("皆に送る");
	}

}
