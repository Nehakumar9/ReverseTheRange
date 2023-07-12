package reversetherange;

import java.util.Scanner;

public class ReverseTheRange {

	public static void reverseTheRange(int array[],int size,int start,int end) {
		for(int i=start;i<end;i++) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		for(int i=0;i<size;i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scanner.nextInt();
		}
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		reverseTheRange(array,n,start,end);

	}

}
