// open.kattis.com/problems/guess

// 2020-10-31

import java.util.Scanner;

public class Guess {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int guess = 500;
        int max = 1000;
        int min = 1;
        
        System.out.println(guess);
        
        while (true) {
            String line = in.nextLine();
            
            if (line.equals("lower")) {
                
                max = guess-1;
                guess = (max+min)/2;
                System.out.println(guess);
                System.out.flush();
                
            } else if (line.equals("higher")) {
                
                min = guess+1;
                guess = (max+min)/2;
                System.out.println(guess);
                System.out.flush();
                
            } else {
                break;
            }
        }
        
    }

}
