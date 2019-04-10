// open.kattis.com/problems/anewalphabet
import java.util.*;
import java.io.*;

public class ANewAlphabet {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String line = in.nextLine().toLowerCase().trim();
        
        line = line.replaceAll("a", "@");           
        line = line.replaceAll("b", "8");           
        line = line.replaceAll("c", "(");           
        line = line.replaceAll("d", "|)");          
        line = line.replaceAll("e", "3");           
        line = line.replaceAll("f", "#");           
        line = line.replaceAll("g", "6");           
        line = line.replaceAll("h", "[-]");         
        line = line.replaceAll("i", "|");           
        line = line.replaceAll("j", "_|");          
        line = line.replaceAll("k", "|<");          
        line = line.replaceAll("l", "1");           
        line = line.replaceAll("m", "[]\\\\/[]");       
        line = line.replaceAll("n", "[]\\\\[]");        
        line = line.replaceAll("o", "0");           
        line = line.replaceAll("p", "|D");          
        line = line.replaceAll("q", "(,)");         
        line = line.replaceAll("r", "|Z");          
        line = line.replaceAll("s", "\\$");         
        line = line.replaceAll("t", "\'][\'");          
        line = line.replaceAll("u", "|_|");
        line = line.replaceAll("v", "\\\\/");
        line = line.replaceAll("w", "\\\\/\\\\/");
        line = line.replaceAll("x", "}{");
        line = line.replaceAll("y", "`/");
        line = line.replaceAll("z", "2");
        
        System.out.println(line);
    }
    
}
