// open.kattis.com/problems/simon

import java.util.Scanner;

public class Simon {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int numLines = in.nextInt();
		in.nextLine();

		for (int p = 0; p < numLines; p++) {

			String line = in.nextLine();
			if (line.indexOf("simon says ") == 0) {
				System.out.println(line.replace("simon says ", ""));
			} else {
				System.out.println();
			}
		}

		in.close();
	}
}
