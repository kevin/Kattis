// open.kattis.com/problems/cetiri

import java.util.Arrays;
import java.util.Scanner;

public class Cetiri {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		int[] arr = new int[] { a, b, c };
		Arrays.sort(arr);
		
		int diff1 = arr[1] - arr[0];
		int diff2 = arr[2] - arr[1];
		
		if (diff2 > diff1) {
			
			System.out.println(arr[1] + diff2/2);
			
		} else if (diff2 == diff1) {
			
			System.out.println(arr[2] + diff2);
			
		} else {
			
			System.out.println(arr[0] + diff1/2);
			
		}
		
	}

}
