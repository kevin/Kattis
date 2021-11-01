// open.kattis.com/problems/summertrip

// 2021-04-10

import java.util.HashSet;
import java.util.Scanner;

public class SummerTrip {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String word = in.next();
        
        //HashSet<String> set = new HashSet<>();
        int c = 0;
        
        for (int i = 0; i < word.length()-1; i++) {
            
            String curr = "" + word.charAt(i);
            boolean[] seen = new boolean[26];
            seen[word.charAt(i) - 'a'] = true;
            for (int x = i+1; x < word.length(); x++) {
                
                String newCurr = curr + word.charAt(x);
                if (word.charAt(i) == word.charAt(x))
                    break;
                if (!seen[word.charAt(x)-'a']) {
                    c++;
                    seen[word.charAt(x)-'a'] = true;
                }
                
            }
            
        }
        
//      System.out.println(set.size());
        
        System.out.println(c);
        
    }

}
