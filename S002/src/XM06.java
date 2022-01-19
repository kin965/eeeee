
public class XM06 {

	public static void main(String[] args) {
		int arr[][] = new int[][] { { 2, 3, 4 }, { 3, 4, 5 } };
		int plus = 1;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				plus = (arr[i][j] * plus);
			}
		}
		System.out.println(plus);
	}

}
