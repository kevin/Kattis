import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ClosestSums {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int caseNum = 1;
		while (in.hasNextInt()) {
			
			int numLines = in.nextInt();
			int[] nums = new int[numLines];
			for (int i = 0; i < numLines; i++) {
				
				nums[i] = in.nextInt();
				
			}
			
			int numGoals = in.nextInt();
			int[] goals = new int[numGoals];
			for (int i = 0; i < numGoals; i++) {
				goals[i] = in.nextInt();
			}
			
			ArrayList<Integer> sums = new ArrayList<>();
			
			for (int i = 0; i < nums.length; i++) {
				
				for (int j = i+1; j < nums.length; j++) {
					
					sums.add(nums[i] + nums[j]);
					
				}
				
			}
			
			Collections.sort(sums);
			
			System.out.println("Case " + caseNum + ":");
			
			for (int y : goals) {
				int closestNum = sums.get(0);
				for (int x : sums) {
					
					if (Math.abs(x - y) < Math.abs(closestNum - y)) {
						
						closestNum = x;
						
					}
					
				}
				
				System.out.println("Closest sum to " + y + " is " + closestNum + ".");
			}
			
			
			caseNum++;
			
		}
		
	}

}
