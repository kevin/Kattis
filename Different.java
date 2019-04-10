// open.kattis.com/problems/different
import java.math.BigInteger;
import java.util.Scanner;

public class Different {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextLine()) {
            
            String line = in.nextLine();
            // System.out.println();
            BigInteger one = new BigInteger(line.trim().split(" ")[0]);
            BigInteger two = new BigInteger(line.trim().split(" ")[1]);
            BigInteger three = one.subtract(two);
            three = three.abs();
            
            System.out.println(three);
            
        }

    }

}
