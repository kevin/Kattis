// open.kattis.com/problems/blockcrusher

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BlockCrusher {
	
	static class Node {
		
		int r;
		int c;
		ArrayList<Node> path;
		int steps;
		
		public Node(int r, int c, ArrayList<Node> path) {
			this.r = r;
			this.c = c;
			this.path = path;
			steps = 0;
			for (Node x : path) {
				steps += x.steps;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			
			int nr = in.nextInt();
			int nc = in.nextInt();
			if (nr == 0 && nc == 0) {
				break;
			}
			in.nextLine();
			int[][] block = new int[nr][nc];
			for (int r = 0; r < nr; r++) {
				String l = in.nextLine();
				for (int c = 0; c < l.length(); c++) {
					block[r][c] = Integer.parseInt(l.charAt(c)+"");
				}
			}
			
			PriorityQueue<Node> q = new PriorityQueue<>((a, b) -> a.steps - b.steps);
			
		}
		
	}

}
