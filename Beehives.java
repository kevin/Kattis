
// open.kattis.com/problems/beehives

import java.util.ArrayList;
import java.util.Scanner;

public class Beehives {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {

			double d = in.nextDouble(); // distance
			int n = in.nextInt(); // num hives
			if (d == 0.0 && n == 0)
				break;
			in.nextLine();

			int sour = 0;
			int sweet = 0;

			// read n hive coordinates
			Hive[] hives = new Hive[n];
			for (int i = 0; i < n; i++) {

				double x = in.nextDouble();
				double y = in.nextDouble();
				in.nextLine();
				hives[i] = new Hive(x, y);
				for (int t = 0; t < i; t++) {

					hives[t].distances.add(Math.sqrt(Math.pow(x - hives[t].x, 2) + Math.pow(y - hives[t].y, 2)));
					hives[i].distances.add(Math.sqrt(Math.pow(x - hives[t].x, 2) + Math.pow(y - hives[t].y, 2)));

				}

			}

			for (Hive x : hives) {

				for (Double ds : x.distances) {

					if (ds <= d) {

						sour++;
						break;

					}

				}

			}

			sweet = n - sour;
			System.out.println(sour + " sour, " + sweet + " sweet");

		}

	}

	static class Hive {

		double x;
		double y;
		ArrayList<Double> distances;

		public Hive(double x2, double y2) {

			this.x = x2;
			this.y = y2;
			distances = new ArrayList<>();

		}

	}

}
