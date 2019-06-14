
// open.kattis.com/problems/dirtydriving

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DirtyDriving {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int numCars = in.nextInt();
		int p = in.nextInt();
		in.nextLine();

		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < numCars; i++) {

			arr.add(in.nextInt());

		}
		Collections.sort(arr);

		int dist = 0;
		for (int i = 0; i < arr.size(); i++) {
			int distKeep = p * (i + 1);
			int distAlready = arr.get(i);
			dist = Math.max(dist, distKeep - distAlready);
		}
		System.out.println(dist + arr.get(0));

	}

}
