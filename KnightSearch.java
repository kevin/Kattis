// open.kattis.com/problems/knightsearch

import java.util.PriorityQueue;
import java.util.Scanner;

public class KnightSearch {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		in.nextLine();
		
		String s = in.nextLine();
		
		char[][] board = new char[n][n];
		
		for (int i = 0; i < s.length(); i++) {
			
			board[i/n][i%n] = s.charAt(i);
			
		}
		
		String ans = "NO";
		
		String goal = "ICPCASIASG";
		
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < n; c++) {
				if (board[r][c] == 'I') {
					PriorityQueue<Node> q = new PriorityQueue<>();
					q.add(new Node(r, c, 1));
					while (!q.isEmpty()) {
						
						Node no = q.remove();
						if (no.r < 0 || no.r >= n || no.c < 0 || no.c >= n) {
							continue;
						}
						
						if (board[no.r][no.c] != goal.charAt(no.steps-1)) {
							continue;
						}
						
						if (no.steps == goal.length()) {
							ans = "YES";
							r = n;
							c = n;
							break;
						}
						
						int steps = no.steps+1;
						q.add(new Node(no.r - 2, no.c - 1, steps));
						q.add(new Node(no.r - 2, no.c + 1, steps));
						q.add(new Node(no.r - 1, no.c - 2, steps));
						q.add(new Node(no.r - 1, no.c + 2, steps));
						q.add(new Node(no.r + 1, no.c - 2, steps));
						q.add(new Node(no.r + 1, no.c + 2, steps));
						q.add(new Node(no.r + 2, no.c - 1, steps));
						q.add(new Node(no.r + 2, no.c + 1, steps));
						
					}
				}
			}
		}
		
		System.out.println(ans);
		
	}
	
	static class Node implements Comparable<Node> {
		
		int r;
		int c;
		int steps;
		
		public Node(int r, int c, int steps) {
			this.r = r;
			this.c = c;
			this.steps = steps;
		}
		
		public int compareTo(Node b) {
			return steps - b.steps;
		}
		
	}
	
}
