// open.kattis.com/problems/engineeringenglish

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EngineeringEnglish {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Set<String> set = new HashSet<String>();
		
		while (in.hasNextLine()) {
			
			String line = in.nextLine();
			String out = "";
			for (String x : line.trim().split("\\s+")) {
				out += (set.add(x.toLowerCase())) ? x + " " : ". ";
			}
			System.out.println(out.trim());
			
		}
		
	}

}
