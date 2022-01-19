package hongbao;

import java.util.ArrayList;

public class TestList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			list.add("kin" + i);
		}

		for (String x : list) {
			System.out.println(x);
		}
	}
}
