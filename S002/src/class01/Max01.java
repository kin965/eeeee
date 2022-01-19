package class01;

//Demo02 のメソッド 最大値の取る方法
public class Max01 {
	int n;
	int min = Integer.MIN_VALUE;
	int array[] = new int[n];

	public void cheakMax(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > min) {
				min = array[i];
			}

		}
		System.out.println(min);
	}
}
