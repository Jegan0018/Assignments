package problems;

import java.util.Arrays;

public class PushNumbers {
	public static void main(String[] args) {
		int[] array= {1, 9, 8, 4, 7, 7, 2, 0, 7, 6, 7};
		int[] result=new int[array.length];
		int k=0,count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]!=7) {
				result[k++]=array[i];
			} else {
				count++;
			}
		}
		for(int i=0;i<count;i++) {
			result[k++]=7;
		}
		System.out.println(Arrays.toString(result));
	}
}
