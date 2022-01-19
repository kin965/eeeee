package kin;

public class C001 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		char grade = 'a';
		switch (grade) {
		case 'a':
			System.out.println("優");
			break;

		case 'b':
			System.out.println("良");
			break;

		case 'c':
			System.out.println("合格");
			break;

		case 'f':
			System.out.println("頑張ってください．");
			break;
		default:
			System.out.println("未知");
		}
		System.out.println("あなたの成績は" + grade);

	}

}
