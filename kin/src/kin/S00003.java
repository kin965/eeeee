package kin;

public class S00003 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int coin = 3988;
		
		if(coin >= 500) {
			System.out.println(coin / 500+"枚500円硬币");
			coin = coin % 500;
		}
		if(coin >= 100) {
			System.out.println(coin / 100+"枚100円硬币");
			coin = coin % 100;
		}
		if(coin >= 50) {
			System.out.println(coin / 50+"枚50円硬币");
			coin = coin % 50;
		}
		if(coin >= 5) {
			System.out.println(coin / 5+"枚5円硬币");
			coin = coin % 5;
		}
		if(coin >= 1) {
			System.out.println(coin / 1+"枚1円硬币");
			coin = coin % 1;
		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		int a = 3330;
//		int b = 500;
//		int c = 100;
//		int d = 10;
//		int e = 5;
//		int f = 1;
//		int a1 =a/b;
//		System.out.println(a1+"枚500円硬币");
//		int a2=a%b;
//		int a3=a2/c;
//		System.out.println(a3+"枚100円硬币");
//		int a4=a%c;
//		int a5=a4/d;
//		System.out.println(a5+"枚10円硬币");
//		int a6=a%d;
//		int a7=a6/e;
//		System.out.println(a7+"枚５円硬币");
//		int a8=a%e;
//		int a9=a8/f;
//		System.out.println(a9+"枚1円硬币");
//		if(a7==0)
//		
//		
		
			
		
		
	}

}
