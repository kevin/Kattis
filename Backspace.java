// open.kattis.com/problems/backspace

import java.util.Scanner;
import java.util.Stack;

public class Backspace {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String line = in.nextLine();
		
		Stack<Character> a = new Stack<>();
		
		for (char c : line.toCharArray()) {
			
			if (c == '<') {
				a.pop();
			} else {
				a.push(c);
			}
			
		}
		
		StringBuilder b = new StringBuilder();
		for (char c : a) {
			b.append(c);
		}
		
		System.out.println(new StringBuilder(b));
		
	}

}
