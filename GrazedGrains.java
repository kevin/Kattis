// open.kattis.com/problems/grazedgrains

import java.util.*;
import java.lang.*;
import java.io.*;

public class GrazedGrains {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(new int[]{in.nextInt(), in.nextInt(), in.nextInt()});
        }
        
        int count = 0;
        for (int i = 0; i < 500000; i++) {
            
            double x = (Math.random()*30)-10;
            double y = (Math.random()*30)-10;
            
            for (int[] c : list) {
                double dist = (x-c[0])*(x-c[0])+(y-c[1])*(y-c[1]);
                if (dist <= c[2]*c[2]) {
                    count++;
                    break;
                }
            }
            
        }
        
        System.out.println(count/500000.0 * 900);
        
    }
    
}
