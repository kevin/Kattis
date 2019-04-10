// open.kattis.com/problems/modulo
import java.util.*;
import java.io.*;

public class Modulo {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        Set<Integer> set = new HashSet<>();
        
        while (in.hasNextLine()) {
            
            set.add(in.nextInt() % 42);
            in.nextLine();
            
        }
        
        System.out.println(set.size());
        
    }
    
} 
