
public class XM04 {

	public static void main(String[] args) {
		int arr[]=new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		
		for(int i =0;i<arr.length;i++) {
			int cheak=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					cheak++;
				}
			
			}
			if(cheak>=2) {
				System.out.print(arr[i]);
			}
		}
    
	}

}
