package map01;

import java.util.ArrayList;
import java.util.List;

public class ListAndMap01 {

	public static void main(String[] args) {
		List<String> datas = new ArrayList<>();
		datas.add("u1");
		datas.add("u3");
		datas.add("u2");
		// リストに各エレメントをアクセスする
		for (String data : datas) {
			System.out.println(data);
		}
	}

}