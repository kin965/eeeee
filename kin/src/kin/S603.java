package kin;

import java.util.Arrays;
//配列の要素ピックアップ
public class S603 {

	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 4};
        
		int startIndex = 1;
		
		int length = 2;
		
		int [] newA= new int [length];
		
		for(int i = startIndex;i<= array.length ;i++) {
			if(i <= length) {
				newA[i-startIndex]=array[i];
			}
		}
		System.out.println(Arrays.toString(newA));
		
		
	}

}
