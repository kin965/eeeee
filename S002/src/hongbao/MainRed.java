package hongbao;

import java.util.ArrayList;

public class MainRed {

	public static void main(String[] args) {

		Manager manager = new Manager("群主", 100);

		Member one = new Member("成员a", 0);
		Member two = new Member("成员b", 0);
		Member three = new Member("成员c", 0);

		manager.Show();
		one.Show();
		two.Show();
		three.Show();
		// 群主一个发20块钱 分三个红包
		ArrayList<Integer> redList = manager.send(20, 3);
		// 三个普通成员去收红包
		one.receive(redList);
		two.receive(redList);
		three.receive(redList);

		manager.Show();
		// 6 6 8 随机分给三个人
		one.Show();
		two.Show();
		three.Show();
	}

}
