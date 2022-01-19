package kin;

public class EH001 {

	public static void main(String[] args) {

		int plus = 1;
		// 最初のPLUSを定義
		int sum = 0;
		// 最初のSUMを定義
		int[][] array = new int[][] {
				// 次元配列
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 2, 1, 1 ,1}};
		
		for (int i = 0; i < array.length; i++) {
        
		for (int j = 0; j < array[i].length; j++) {
		
			
	  
				sum = (sum + array[i][j]);
                //一組と二組のSUM値を取る
				plus = (plus * array[i][j]);
				//一組と二組のPLUS値を取る
			}

		}

		System.out.println("この次元配列SUMの値は"+sum);
		System.out.println("この次元配列の積算の値は"+plus);
	}
}
