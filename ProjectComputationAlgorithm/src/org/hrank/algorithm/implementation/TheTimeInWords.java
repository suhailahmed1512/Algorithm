package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement the-time-in-words algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class TheTimeInWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String staticData[] = { "zero", "one", "two", "three", "four", "five",
				"six", "seven", "eight", "nine", "ten", "eleven", "twelve",
				"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen", "twenty", "twenty one", "twenty two",
				"twenty three", "twenty four", "twenty five", "twenty six",
				"twenty seven", "twenty eight", "twenty nine", "half" };

		int hour = sc.nextInt();
		int minute = sc.nextInt();

		if (minute == 0)
			System.out.println(staticData[hour] + " o' clock");
		else if (minute == 1)
			System.out.println("one minute past " + staticData[hour]);
		else if (minute > 1 && minute < 30 && minute != 15)
			System.out.println(staticData[minute] + " minutes past "
					+ staticData[hour]);
		else if (minute == 15)
			System.out.println("quarter past " + staticData[hour]);
		else if (minute == 30)
			System.out.println("half past " + staticData[hour]);
		else if (minute == 45)
			System.out.println("quarter to " + staticData[hour + 1]);
		else if (minute > 30 && minute < 60 && minute != 45)
			System.out.println(staticData[60 - minute] + " minutes to "
					+ staticData[hour + 1]);

		sc.close();
	}
}
