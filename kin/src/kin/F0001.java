package kin;

public class F0001 {

	public static void main(String[] args) {

		int array[] = new int[] { 2, 7, 4, 5, 9, 1, };
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[minIndex]) // 找到最小的数
					minIndex = j; // 将最小数的索引保存
			}
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
     for(int i =0;i<array.length;i++) {
    	 System.out.println(array[i]);
     } 
	}
	
}
