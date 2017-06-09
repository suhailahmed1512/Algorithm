package org.hrank.algorithm.string;

import java.util.Scanner;

/**
 * Class to implement Richie Rich Algorithm
 * 
 * @author suhail-a
 * @version 1.1
 * 
 */
public class RichieRich1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int k = sc.nextInt();

		// Counter to check it against the required minimal steps
		int counter = 0;

		StringBuilder data = new StringBuilder(sc.next());

		// Checking whether the I/P is pal and counter is <= k steps
		if (checkforPal(data) && counter <= k) {
			System.out.println(data);
		} else {

			int i = 0, j = data.length() - 1;

			while (i < j) {

				// Checking for the left & right side to make it palindrome
				if (data.charAt(i) != data.charAt(j)) {
					
					
					if(data.charAt(i) < data.charAt(j)){
						
						
					}
					
				}else{
					
					//checking for pal and steps limit too has been checked
					if(checkforPal(data)){
						System.out.println(data);
					}else {
						i++; j--;
						
					}
				}
			}
		}

		// Freeing up the resources
		sc.close();
	}

	/**
	 * Method to check for the pal
	 * 
	 * @param data
	 * @return
	 */
	static boolean checkforPal(StringBuilder data) {

		StringBuilder str = data.reverse();

		if (str.equals(data)) {
			return true;
		} else {
			return false;
		}
	}
}
