// open.kattis.com/problems/whatdoesthefoxsay

import java.util.ArrayList;
import java.util.Scanner;

public class WhatDoesTheFoxSay {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numCases = in.nextInt();
		in.nextLine();
		
		for (int p = 0; p < numCases; p++) {
			
			String[] sounds = in.nextLine().trim().split("\\s+");
			ArrayList<String> known = new ArrayList<>();
			while (in.hasNextLine()) {
				
				String line = in.nextLine();
				if (line.contains("what does the fox say?")) {
					
					break;
					
				} else {
					
					known.add(line.trim().split("\\s+")[2]);
					
				}
				
			}
			
			for (int i = 0; i < sounds.length; i++) {
				
				if (!known.contains(sounds[i])) {
					
					System.out.print(sounds[i]);
					if (i != sounds.length-1) {
						System.out.print(" ");
					}
					
				}
				
			}
			System.out.println();
			
		}
		
	}

}
