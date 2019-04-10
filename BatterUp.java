// open.kattis.com/problems/batterup
import java.util.*;
import java.io.*;

public class BatterUp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner in = new Scanner(System.in);
        int numCases = in.nextInt();
        in.nextLine();
        String[] arr = in.nextLine().trim().split(" ");
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) == -1) {
                continue;
            }
            count++;
            sum += Integer.parseInt(arr[i]);
        }
        
        System.out.println((double) sum / count);
        
    }

}
