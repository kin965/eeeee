package testt;

public class S6001 {

	public static void main(String[] args) {
	int[]array=new int[] {2,4,6,8,10};
    int max=ckeakMax(array);
    System.out.print(max);
	}

	public static int ckeakMax(int[]array) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (max <array[i]) {
				max = array[i];
			}

	
		}
		return max;
	}
	
}
