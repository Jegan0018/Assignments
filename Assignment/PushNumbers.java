package problems;

import java.util.Arrays;
import java.util.Scanner;

public class PushNumbers {
	public static void main(String[] args) {
		System.out.println("Enter Array Length");
		Scanner scanner=new Scanner(System.in);
		int length=scanner.nextInt();
		int array[]=new int[length];
		for(int i=0;i<length;i++) {
			array[i]= scanner.nextInt();
		}
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
