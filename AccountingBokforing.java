// open.kattis.com/problems/bokforing

// 2021-09-23

import java.util.HashMap;
import java.util.Scanner;

public class AccountingBokforing {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int Q = in.nextInt();
        in.nextLine();
        
        int[] p = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();
        int base = 0;
        
        while (in.hasNextLine()) {
            
            String command = in.next();
            if (command.equals("SET")) {
                int a = in.nextInt()-1;
                int b = in.nextInt();
                p[a] = b;
                map.put(a, b);
            }
            if (command.equals("PRINT")) {
                int a = in.nextInt()-1;
                if (map.containsKey(a)) {
                    System.out.println(map.get(a));
                } else {
                    System.out.println(base);
                }
            }
            if (command.equals("RESTART")) {
                int a = in.nextInt();
                map.clear();
                base = a;
            }
            
            in.nextLine();
            
        }
        
    }

}
