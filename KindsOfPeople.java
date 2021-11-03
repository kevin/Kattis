// open.kattis.com/problems/10kindsofpeople

import java.util.LinkedList;
import java.util.Scanner;

public class KindsOfPeople {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int R = in.nextInt();
		int C = in.nextInt();
		
		in.nextLine();
		
		int[][] map = new int[R][C];
		
		for (int i = 0; i < R; i++) {
			String l = in.nextLine();
			for (int c = 0; c < C; c++) {
				map[i][c] = l.charAt(c) - '0';
			}
		}
		
		int countEven = 0; // binary zones
		int countOdd = 0; // decimal zones
		
		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				
				if (map[r][c] <= 1) {
					fill(map, r, c, map[r][c] == 1 ? 3+2*countOdd++ : 2+2*countEven++); // lol
				}
				
			}
		}
		
		int N = in.nextInt();
		
		while (N-->0) {
			int a = in.nextInt()-1;
			int b = in.nextInt()-1;
			int c = in.nextInt()-1;
			int d = in.nextInt()-1;
			
			if (map[a][b] == map[c][d]) {
				if (map[a][b] % 2 == 0) {
					System.out.println("binary");
				} else {
					System.out.println("decimal");
				}
			} else {
				System.out.println("neither");
			}
		}
		
	}
	
	static void fill(int[][] map, int r, int c, int value) {
		
		LinkedList<int[]> q = new LinkedList<>();
		q.add(new int[] {r, c});
		
		int original = map[r][c];
		
		while (!q.isEmpty()) {
			
			int[] cur = q.remove();
			if (cur[0] < 0 || cur[0] >= map.length || cur[1] < 0 || cur[1] >= map[0].length) {
				continue;
			}
			if (map[cur[0]][cur[1]] != original) {
				continue;
			}
			
			map[cur[0]][cur[1]] = value;
			q.add(new int[] {cur[0]+1, cur[1]});
			q.add(new int[] {cur[0]-1, cur[1]});
			q.add(new int[] {cur[0], cur[1]+1});
			q.add(new int[] {cur[0], cur[1]-1});
			
		}
		
	}

}
