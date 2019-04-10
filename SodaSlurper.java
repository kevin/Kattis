// open.kattis.com/problems/sodasurpler
import java.util.Scanner;

public class SodaSlurper {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner in = new Scanner(System.in);
        int e = in.nextInt();
        int f = in.nextInt();
        int c = in.nextInt();
        
        int b = e + f;
        int d = 0;
        
        while (b >= c) {
            b -= c;
            d+=1;
            b++;
        }
        
        System.out.println(d);

    }

}
