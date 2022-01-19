package class01;

//Demo02 のメソッド 平均値の取る方法
public class Hk01 {
	int n;
	int array2[] = new int[n];
	int sum = 0;

	public void cheakHk(int array2[]) {
		for (int i = 0; i < array2.length; i++) {
			sum = array2[i] + sum;
		}
		int hk = sum / array2.length;
		System.out.println(hk);
	}

}
