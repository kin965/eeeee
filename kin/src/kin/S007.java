package kin;

public class S007 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		  char ski = 'g';
			switch (ski) {
			case 'a':
				System.out.println("good");
				break;
			case'b':
				System.out.println("ok");
				break;
			case'c':
				System.out.println("NG");
				break;
				default:
				System.out.println("???");
				
			
			}
			
			String userId = "kin";
			String password = "123qazedcvfdr";
			
			System.out.println(password.length());
			if(password.length() > 8 && password.length() < 30) {
				
				if(userId.equals("kin") && password.equals("123qaz")) {
					System.out.println("ok");
				}else {
					System.out.println("NG");
				}
				
			}else {
				
			}
			
			String name = "DC\tNET.hdsgfkfxkglv\nhk;";
			System.out.println(name);
			
			if(name.equals("DCNET.")) {
				System.out.println(123);
			}else {
				System.out.println(444444555);
			}
			
			
			System.out.println("あなたの成績は"+ski);

	}

}
