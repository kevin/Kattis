// open.kattis.com/problems/hissingmicrophone
import java.util.*;
import java.io.*;

public class HissingMicrophone {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        
        if (line.contains("ss")) {
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
        
    }
}
