// open.kattis.com/problems/greedilyincreasing

// 2020-10-31

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GreedilyIncreasing {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(in.readLine());
        StringTokenizer nums = new StringTokenizer(in.readLine());
        int first = Integer.parseInt(nums.nextToken());
        
        StringBuilder out = new StringBuilder();
        out.append(first);
        
        int x = 1;
        int last = first;
        
        for (int i = 1; i < N; i++) {
            int c = Integer.parseInt(nums.nextToken());
            if (c > last) {
                x++;
                out.append(" ");
                out.append(c);
                last = c;
            }
        }
        
        System.out.println(x);
        System.out.println(out);
        
    }

}
