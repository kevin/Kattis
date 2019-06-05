// open.kattis.com/problems/alphabet

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String line = in.nextLine();

		System.out.println(26 - longestIncreasingSubsequence(line));

	}

	public static int longestIncreasingSubsequence(String line) {

		int[] arr = new int[line.length()];
		int[] sol = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1;
			sol[i] = i;
		}

		char[] chars = line.toCharArray();
		for (int i = 1; i < line.length(); i++) {

			for (int j = 0; j < i; j++) {

				if (chars[i] > chars[j]) {
					if (arr[j] + 1 > arr[i]) {
						arr[i] = arr[j] + 1;
						sol[i] = j;
					}
				}

			}

		}

		int max = arr[0];
		for (int x : arr) {

			if (x > max)
				max = x;

		}

		return max;

	}

}
