package arraylist;
//遍历集合 
import java.util.ArrayList;

public class Demo04ArrayListh {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("tony");
		list.add("bxq");
		list.add("zdf");

		// 遍历集合
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
      
	}

}
