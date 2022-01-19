
public class XM02 {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		int plus = 1;
		for (int i = 0; i < arr.length; i++) {
			plus = (arr[i] * plus);
		}
		System.out.println(plus);
	}
	

}
