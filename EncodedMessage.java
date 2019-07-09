// open.kattis.com/problems/encodedmessage

import java.util.Scanner;

public class EncodedMessage {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int numLines = in.nextInt();
		in.nextLine();

		for (int i = 0; i < numLines; i++) {

			String line = in.nextLine();
			int x = (int) (Math.sqrt(line.length()));
			String message = "";
			int index = x - 1;
			while (message.length() < line.length()) {

				if (index >= line.length()) {

					index = index - 1 - line.length();

				}

				message += line.charAt(index);
				index += x;

			}

			System.out.println(message);

		}

	}

}
