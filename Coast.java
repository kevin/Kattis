// open.kattis.com/problems/coast

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Coast {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		in.nextLine();

		char[][] map = new char[N + 2][M + 2];
		for (int i = 1; i <= N; i++) {
			char[] row = new char[M + 2];
			String s = in.nextLine();
			for (int j = 1; j <= M; j++)
				row[j] = s.charAt(j-1);
			map[i] = row;
		}
		
		floodFill(map, 0, 0, '2');

		int length = 0;

		for (int r = 1; r <= N; r++)
			for (int c = 1; c <= M; c++) {
				if (map[r][c] == '1') {
					if (map[r - 1][c] == '2')
						length++;
					if (map[r + 1][c] == '2')
						length++;
					if (map[r][c - 1] == '2')
						length++;
					if (map[r][c + 1] == '2')
						length++;
				}
			}

		

		System.out.println(length);

	}
	
	static void floodFill(char[][] map, int r, int c, char e) {
		
		if (r < 0 || c < 0 || r >= map.length || c >= map[0].length)
			return;
		if (map[r][c] == '1' || map[r][c] == e)
			return;
		
		map[r][c] = e;
		floodFill(map, r-1, c, e);
		floodFill(map, r+1, c, e);
		floodFill(map, r, c-1, e);
		floodFill(map, r, c+1, e);
		
	}

}