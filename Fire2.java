// open.kattis.com/problems/fire2

// 2021-10-27

// this is basically copy pasted from my Fire3 solution

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Fire2 {

    static class Node implements Comparable<Node> {

        int r, c, steps;

        public Node(int... arg) {
            r = arg[0];
            c = arg[1];
            steps = arg[2];
        }

        @Override
        public int compareTo(Node b) {
            // TODO Auto-generated method stub
            return steps - b.steps;
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine();

        while (N-->0) {

            int C = in.nextInt();
            int R = in.nextInt();

            in.nextLine();

            char[][] mat = new char[R][C];
            int[] joe = new int[2];
            ArrayList<int[]> fire = new ArrayList<>();
            for (int i = 0; i < R; i++) {
                char[] line = in.nextLine().toCharArray();
                for (int j = 0; j < line.length; j++) {
                    if (line[j] == '@') {
                        joe = new int[] { i, j };
                    }
                    if (line[j] == '*') {
                        fire.add(new int[] { i, j });
                    }
                }
                mat[i] = line;
            }

            int[][] joeS = new int[R][C];
            int[][] fireS = new int[R][C];

            LinkedList<Node> q = new LinkedList<>();
            for (int[] ff : fire) {
                q.add(new Node(ff[0], ff[1], 1));
            }

            while (!q.isEmpty()) {

                Node cur = q.remove(0);
                int r = cur.r;
                int c = cur.c;
                int steps = cur.steps;

                if (r < 0 || c < 0 || r >= R || c >= C || mat[r][c] == '#') {
                    continue;
                }

                if (fireS[r][c] != 0) {
                    continue;
                }

                fireS[r][c] = steps;

                q.add(new Node(r + 1, c, steps + 1));
                q.add(new Node(r - 1, c, steps + 1));
                q.add(new Node(r, c + 1, steps + 1));
                q.add(new Node(r, c - 1, steps + 1));

            }

            q = new LinkedList<>();
            Node first = new Node(joe[0], joe[1], 1);
            q.add(first);

            boolean found = false;

            while (!q.isEmpty()) {

                Node cur = q.remove(0);
                int r = cur.r;
                int c = cur.c;
                int steps = cur.steps;

                if (joeS[r][c] <= steps && joeS[r][c] != 0 || fireS[r][c] <= steps && fireS[r][c] != 0) {
                    continue;
                }

                joeS[r][c] = steps;

                if (r == 0 || c == 0 || r == R - 1 || c == C - 1) {
                    found = true;
                    System.out.println(steps);
                    break;
                }

                if (r + 1 >= 0 && c >= 0 && r + 1 < R && c < C && mat[r + 1][c] != '#') { // out of bounds
                    q.add(new Node(r + 1, c, steps + 1));
                }
                if (r - 1 >= 0 && c >= 0 && r - 1 < R && c < C && mat[r - 1][c] != '#') { // out of bounds
                    q.add(new Node(r - 1, c, steps + 1));
                }
                if (r >= 0 && c + 1 >= 0 && r < R && c + 1 < C && mat[r][c + 1] != '#') { // out of bounds
                    q.add(new Node(r, c + 1, steps + 1));
                }
                if (r >= 0 && c - 1 >= 0 && r < R && c - 1 < C && mat[r][c - 1] != '#') { // out of bounds
                    q.add(new Node(r, c - 1, steps + 1));
                }

            }

//        System.out.println(Arrays.deepToString(fireS));
//        System.out.println(Arrays.deepToString(joeS));

            if (!found) {
                System.out.println("IMPOSSIBLE");
            }
        }

    }

}
