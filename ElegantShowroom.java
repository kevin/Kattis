// open.kattis.com/problems/showroom

// 2021-09-15

import java.util.PriorityQueue;
import java.util.Scanner;

public class ElegantShowroom {
    
    static class Pos implements Comparable<Pos> {
        
        int r,c,steps;
        public Pos(int r, int c, int steps) {
            this.r=r;
            this.c=c;
            this.steps=steps;
        }

        public int compareTo(Pos o) {
            return steps-o.steps;
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int R = in.nextInt();
        int C = in.nextInt();
        in.nextLine();
        
        char[][] map = new char[R][C];
        for (int i = 0; i < R; i++) {
            map[i] = in.nextLine().trim().toCharArray();
        }
        
        int sr = in.nextInt();
        int sc = in.nextInt();
        
        PriorityQueue<Pos> q = new PriorityQueue<>();
        
        q.add(new Pos(sr-1, sc-1, 0));
        
        while (!q.isEmpty()) {
            
            Pos curr = q.remove();
            
            if (curr.r < 0 || curr.c < 0 || curr.r >= R || curr.c >= C)
                continue;
            
            if (map[curr.r][curr.c] == '#')
                continue;
            
            int count = curr.steps;
            
            if (map[curr.r][curr.c] == 'c')
                count++;
            
            if (curr.r == 0 || curr.c == 0 || curr.r == R-1 || curr.c == C-1) {
                System.out.println(count);
                break;
            }
            
            map[curr.r][curr.c] = '#';
            
            q.add(new Pos(curr.r+1, curr.c, count));
            q.add(new Pos(curr.r-1, curr.c, count));
            q.add(new Pos(curr.r, curr.c-1, count));
            q.add(new Pos(curr.r, curr.c+1, count));
            
        }
        
    }

}
