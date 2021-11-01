// open.kattis.com/problems/crypto

// 2021-04-10

import java.util.Scanner;

public class Crypto {
    
    public static void main(String[] args) {
        
        long N = new Scanner(System.in).nextLong();
        
        int mostZero = 0;
        int mostZeroBase = 2;
        
        for (int b = 2; b <= N; b++) {
            
            long temp = N;
            int x = 0;
            while (temp%b == 0) {
                x++;
                temp /= b;
            }
            
            if (x > mostZero) {
                mostZero = x;
                mostZeroBase = b;
            }
            
        }
        
        System.out.println(mostZeroBase);
        
    }

}
