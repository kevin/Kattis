// open.kattis.com/problems/beekeeper
import java.util.Scanner;

public class Beekeeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		while (in.hasNextLine()) {

			int numWords = in.nextInt();
			if (numWords == 0)
				break;
			in.nextLine();
			String[] words = new String[numWords];
			for (int i = 0; i < numWords; i++)
				words[i] = in.nextLine();

			String longest = "";
			for (String x : words) {
				if (countPairs(x) >= countPairs(longest))
					longest = x;
			}
			System.out.println(longest);

		}

	}

	public static int countPairs(String s) {

		String[] t = s.split("(ee|aa|ii|oo|uu|yy)");
		return t.length;

	}

}
