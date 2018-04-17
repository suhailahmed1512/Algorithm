package org.hrank.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Class to implement chocolate-feast algo.
 * 
 * @author suhahmed0
 * @version 1.0
 *
 */
public class ChocolateFeast {

	public static void main(String[] args) throws IOException {

		BufferedReader in = null;
		PrintStream out = null;
		try {

			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintStream(System.out);
			int N = Integer.parseInt(in.readLine());
			while (--N >= 0) {
				String lineItems[] = in.readLine().split(" ");
				int n = Integer.parseInt(lineItems[0]);
				int c = Integer.parseInt(lineItems[1]);
				int m = Integer.parseInt(lineItems[2]);

				out.println(chocolateFeastWithoutRecursion(n, c, m));
				out.println(chocolateFeast(n, c, m));
			}
		} catch (NumberFormatException e) {
			out.print("Exception occured due to" + e);
		} catch (IOException e) {
			out.print("Exception occured due to" + e);
		} finally {
			// Freeing up the resources
			in.close();
			out.close();
		}
	}

	/**
	 * Method to get the total chocolates after returning chocolates
	 * 
	 * @param n
	 * @param c
	 * @param m
	 * @return
	 */
	static int chocolateFeast(int n, int c, int m) {

		int totalChoclates = 0;

		totalChoclates = n / c;

		return totalChoclates + countWrappersChoclate(totalChoclates, m);
	}

	/**
	 * Method to count wrappers
	 * 
	 * @param choclates
	 * @param wrappers
	 * @return
	 */
	static int countWrappersChoclate(int choclates, int wrappers) {

		if (choclates < wrappers)
			return 0;

		int newChoc = choclates / wrappers;

		return newChoc + countWrappersChoclate(newChoc + choclates % wrappers, wrappers);

	}

	/**
	 * Method to get the total chocolates without recursion (Brute Forcing)
	 * 
	 * @param n
	 * @param c
	 * @param m
	 * @return
	 */
	static int chocolateFeastWithoutRecursion(int n, int c, int m) {

		int totalChocs = n / c;
		// Below code without using recursion
		int wrappers = totalChocs;
		while (m <= wrappers) {
			wrappers = wrappers - m;
			totalChocs++;
			wrappers++;
		}

		return totalChocs;
	}
}
