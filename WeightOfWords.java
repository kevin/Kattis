
// open.kattis.com/problems/weightofwords

import java.util.Scanner;

public class WeightOfWords {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int weight = in.nextInt();

		int[] values = new int[length];
		for (int i = 0; i < length; i++) {
			values[i] = 1;
		}

		if (weight < length || weight > length * 26) {

			System.out.println("impossible");

		} else {

			while (getSum(values) < weight) {

				int id = (int) (Math.random() * length);
				while (values[id] + 1 > 26)
					id = (int) (Math.random() * length);

				values[id]++;

			}

			System.out.println(getString(values));

		}

	}

	public static int getSum(int[] arr) {

		int a = 0;
		for (int i = 0; i < arr.length; i++)
			a += arr[i];

		return a;

	}

	public static String getString(int[] arr) {

		String x = "";

		for (int i : arr)
			x += (char) ('a' + (i - 1));

		return x;

	}

}
