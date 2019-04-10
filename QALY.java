// open.kattis.com/problems/qaly
import java.util.*;

public class QALY {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int numLines = in.nextInt(); in.nextLine();
        
        double sum = 0;
        
        for (int p = 0; p < numLines; p++) {
            
            double one = in.nextDouble();
            double two = in.nextDouble();
            
            sum += (one*two);
            
        }
        
        System.out.println(String.format("%.3f", sum));
        
    }
}
