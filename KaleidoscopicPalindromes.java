// open.kattis.com/problems/kaleidoscopicpalindromes

// 2020-10-31

import java.util.Scanner;

public class KaleidoscopicPalindromes {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        int count = 0;
        
        for (int i = a; i <= b; i++) {
            
            boolean good = true;
            
            for (int x = 2; x <= Math.min(36, c); x++) {
                
                String inbase = Integer.toString(i, x);
                if (! new StringBuilder(inbase).reverse().toString().equals(inbase)) {
                    good = false;
                    break;
                }
                
            }
            
            if (good)
                count++;
            
        }
        
        System.out.println(count);
        
    }

}
