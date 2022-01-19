package class01;

//Demo02 のメソッド 最小値の取る方法
public class Min01 {
	int n;
	int array1[] = new int[n];

	public void ckeakMin(int[] array1) {
		int max = Integer.MAX_VALUE;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] < max) {
				max = array1[i];
			}
		}
		System.out.println(max);
	}

}
