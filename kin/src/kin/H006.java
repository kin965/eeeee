package kin;

public class H006 {
	public static void main(String[] args) {
		int[] arr = new int[] {4,1,3,2 ,5,6};

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] >arr[i]) {
					int x = arr[i];
					arr[i] = arr[j];
					arr[j] = x;
					//i  <=> j

				}
				//System.out.print( arr[j]);
				}
			}
		
		for (int q = 0; q < arr.length; q++) {
			System.out.println( arr[q]);
		}
		}
}
