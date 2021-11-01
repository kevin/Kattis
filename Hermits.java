// open.kattis.com/problems/hermits

// 2021-10-27

import java.util.ArrayList;
import java.util.Scanner;

public class Hermits {
    
    static class V {
        
        ArrayList<V> to;
        int p; // people
        int bus; // busy-ness
        
        public V(int p) {
            this.p = p;
            to = new ArrayList<>();
            bus = p;
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        in.nextLine();
        
        ArrayList<V> g = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            g.add(new V(in.nextInt()));
        }
        
        int M = in.nextInt();
        int low = 2099999999;
        int lowID = -1;
        while (M-->0) {
            int a = in.nextInt(); int b = in.nextInt();
            g.get(a-1).bus += g.get(b-1).p;
            g.get(b-1).bus += g.get(a-1).p;
        }
        
        for (int i = 0; i < N; i++) {
            if (g.get(i).bus < low) {
                lowID = i;
                low = g.get(i).bus;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
            }
        }
        
        System.out.println(lowID+1);
        
    }

}
