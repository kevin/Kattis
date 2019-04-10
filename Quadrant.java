// open.kattis.com/problems/quadrant
import java.util.*;

public class Quadrant {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int one = in.nextInt();
        int two = in.nextInt();
        
        if (one < 0 && two < 0) {
            System.out.println(3);
        }
        if (one > 0 && two > 0) {
            System.out.println(1);
        }
        if (one < 0 && two > 0) {
            System.out.println(2);
        }
        if (one > 0 && two < 0) {
            System.out.println(4);
        }
        
    }
    
}
