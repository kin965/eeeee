package kin;

import java.util.Arrays;

public class S604 {
	// 質問６-２︓以下静的なメソッドを定義してください。

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4 };

		// 固定値
		int startIndex = 1;
		// 固定値
		int length = 2;

		int[] newArray = get(startIndex, length, array);
		System.out.println(Arrays.toString(newArray));

	}

	public static int[] get(int startIndex, int length, int[] array) {
		// 新しい配列のインデックスの極値を確定
		int[] newArray = new int[length];
		/*
		         1     2     3     4 
		  aのi   ⓪    ①    ②    ➂ <== 第一位の不要
		  Nのi         ⓪    ①       <== 長さは２
		  
		  
		  
		  
		  
		  */
		for (int i = startIndex; i < array.length; i++) {
			if (i <= 2) {
				newArray[i - startIndex] = array[i];
         //                    「1」は(固定不要な部分) 
			}
		}
		for (int i = 0; i < newArray.length; i++) {
			// System.out.println(newArray[i]);
		}
		return newArray;
	}

}
