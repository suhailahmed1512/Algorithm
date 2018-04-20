package org.hrank.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class to implement marcs-cakewalk algo.
 * 
 * @author sahm16
 * @version 1.0
 *
 */
public class MarcsCakewalk {

	public static void main(String[] args) throws IOException {

		BufferedReader in = null;
		PrintStream out = null;
		try {

			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintStream(System.out);
			int n = Integer.parseInt(in.readLine());
			String lineItems[] = in.readLine().split(" ");
			List<Integer> cakeCalories = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				cakeCalories.add(Integer.parseInt(lineItems[i]));
			}
			Collections.sort(cakeCalories);
			Collections.reverse(cakeCalories);
			out.println(getMarcCakewalkMiles(n, cakeCalories));
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
	 * Method to get the total miles marc need to walk to eat all the cakes
	 * 
	 * @param n
	 * @param arr
	 * @return
	 */
	static long getMarcCakewalkMiles(int n, List<Integer> cakeCalories) {

		long totalMiles = 0;
		for (int i = 0; i < n; i++) {
			totalMiles += Math.pow(2, i) * cakeCalories.get(i);
		}

		return totalMiles;
	}
}
