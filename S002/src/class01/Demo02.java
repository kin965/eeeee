package class01;

//最大値と最小値を取る方法
public class Demo02 {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4 };

		Max01 max = new Max01();
		max.array = arr;
		System.out.print("最大値は");
		max.cheakMax(arr);

		Min01 min = new Min01();
		min.array1 = arr;
		System.out.print("最小値は");
		min.ckeakMin(arr);

		Hk01 hk = new Hk01();
		hk.array2 = arr;
		System.out.print("平均値は");
		hk.cheakHk(arr);

	}

}
