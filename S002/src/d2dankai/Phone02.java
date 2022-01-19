package d2dankai;

public class Phone02 {
	public static void main(String[] args) {
		Phone use = new Phone();
		use.brand = "huawei";
		use.color = "yello";
		use.price = 50.5;

		use.call("ii");
		use.sendMessage();

	}
}
