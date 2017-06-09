package org.hrank.algorithm.string;

public class TEST {

	public static void main(String[] args) {
		
		System.out.println(87%26);
		String str = "-";
		int k = 2;
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {

			char character = str.charAt(i);

			if (character >= 65 && character < 91) {

				if ((character + k) > 90) {

					character = (char) ((character + k) - 26);
				} else {

					character += k;
				}
				str1 += String.valueOf(character);

			} else if (character >= 97 && character < 123) {

				if ((character + k) > 122) {

					character = (char) ((character + k) - 26);
				} else {

					character += k;
				}
				str1 += String.valueOf(character);
			} else {
				str1 += String.valueOf(character);
			}

		}
		
		System.out.println(str1);

	}
}
