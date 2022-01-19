package Random;
import java.util.Random;
public class Dwmo02random {
//左闭右开区间 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random r = new Random();
		for(int i =0;i<100;i++) {
			int num= r.nextInt(10);
			System.out.println(num);
		}
		
	}

}
