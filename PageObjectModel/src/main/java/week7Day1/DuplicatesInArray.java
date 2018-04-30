package week7Day1;

import java.util.Arrays;

public class DuplicatesInArray {

	public static void main(String[] args) {
		
		int[] a ={1,7,8,7,1};
		
		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			
			if(Arrays.binarySearch(a,a[i]) == i){
				System.out.println(a[i]);
				
			}
		
		
		
		
		
		
		
		/*for(int i=0;i<=a.length-1;i++){
			int flag= 0;
			for(int j=i;j<=a.length-1;j++){
				
				if(a[i]==a[j]){
					flag++;
				}
				if(flag > 1){
					System.out.println(a[i]);
					flag =0;
				}
			}
			
		}*/
		
		
		
	}
	}

}
	