// open.kattis.com/problems/almostperfect

import java.util.Scanner;

public class AlmostPerfect {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while (in.hasNextLine()) {
			
			int n = in.nextInt();
			in.nextLine();
			
			int sum = 1;
			
			for (int i = 2; i <= Math.sqrt(n); i++) {
				
				if (n % i == 0) {
					if (n/i == i)
						sum += i;
					else
						sum += i + n/i;
				}
				
			}
			
			int dif = Math.abs(sum-n);
			
			if (dif == 0) {
				System.out.println(n + " perfect");
			} else if (dif <= 2) {
				System.out.println(n + " almost perfect");
			} else {
				System.out.println(n + " not perfect");
			}
			
		}
		
	}

}
