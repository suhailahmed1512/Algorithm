package org.hrank.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.regex.Pattern;

/**
 * Class to implement strong-password algo.
 * 
 * @author sahm16
 * @version 1.0
 *
 */
public class StrongPassword {

	public static void main(String[] args) throws IOException {

		BufferedReader in = null;
		PrintStream out = null;
		try {

			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintStream(System.out);
			int n = Integer.parseInt(in.readLine());
			String password = in.readLine();
			out.println(minimumNumber(n, password));

		} catch (NumberFormatException e) {
			out.print("Exception occured due to" + e);
		} catch (IOException e) {
			out.print("Exception occured due to" + e);
		} finally {
			in.close();
			out.close();
		}
	}

	/**
	 * Method to find the minimum character req. to add to make strong password
	 * 
	 * @param n
	 * @param password
	 * @return
	 */
	static int minimumNumber(int n, String password) {

		int minimumNumber = 0;

		String digitRegex = "(\\d)";
		String uppercaseRegex = "([A-Z])";
		String lowercaseRegex = "([a-z])";
		String specialCharRegex = "(\\W)";
		
		 

		if (!password.matches(digitRegex)) {
			minimumNumber++;
		}

		if (!password.matches(lowercaseRegex)) {
			minimumNumber++;
		}

		if (!password.matches(uppercaseRegex)) {
			minimumNumber++;
		}

		if (!password.matches(specialCharRegex)) {
			minimumNumber++;
		}

		if ((minimumNumber+password.length()) < 6) {
			minimumNumber += 6 - (minimumNumber + password.length());
		}

		return minimumNumber;
	}
}
