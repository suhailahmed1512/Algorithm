package org.hrank.algorithm.string;

import java.util.Scanner;

/**
 * Class to implement Richie Rich Algorithm
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class RichieRich {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int k = sc.nextInt();

		int counter = 0;

		StringBuilder data = new StringBuilder(sc.next());
		if (checkforPal(data.toString())) {
			/* System.out.println("inside check for palindrome check"); */
			System.out.println(data.toString());
		} else {
			/*System.out.println("inside else check for palindrome check"+ " INIRIAL LENGTH IS "+ data.length());*/
			int i = 0, j = data.length() - 1;
			
			/* System.out.println(i +" is i and j is "+j); */
			
			while (i < j) {
				System.out.println("value of i is " + i + " and value of j is "
						+ j);
				System.out.println(data.charAt(i) + " character at ith " + i
						+ " and " + data.charAt(j) + " character at jth " + j);
				// Checking for the characters equality
				
				if (data.charAt(i) != data.charAt(j)) {
					System.out.println("inside character not equal");
					counter++;
					
					if (data.charAt(i) < data.charAt(j)) {
						System.out.println("Before " + data);
						char tobeReplaced = data.charAt(j);
						data.deleteCharAt(i);
						System.out.println("LENGTH AFTER DELETE is"+data.length());
						/*data.replace(i, i, String.valueOf(data.charAt(j)));*/
						data.replace(i, i, String.valueOf(tobeReplaced));
						System.out.println("After " + data);
						
						if (checkforPal(data.toString()) && counter <= k) {
							System.out.println(data);
							break;
						} else {
							i++;
							j--;
						}

					} else {
						
						System.out.println("Before " + data);
						char tobeReplaced = data.charAt(i);
						data.deleteCharAt(j);
						/*data.replace(j, j, String.valueOf(data.charAt(i)));*/
						data.replace(i, i, String.valueOf(tobeReplaced));
						
						System.out.println("After " + data);
						if (checkforPal(data.toString()) && counter <= k) {
							System.out.println(data);
							break;
						} else {
							i++;
							j--;
						}
					}
				} else {
					if (counter > k) {
						System.out.println("-1");
						break;
					} else {
						if (checkforPal(data.toString())) {
							System.out.println(data);
							break;
						} else {
							i++;
							j--;
						}
					}
				}

			}
			
			System.out.println(counter+" counter value");
			/*if (counter > k) {
				System.out.println("-1");
			} else {
				System.out.println(data);
			}*/

			sc.close();
		}
	}

	/**
	 * Method to check for the pal
	 * 
	 * @param data
	 * @return
	 */
	static boolean checkforPal(String data) {

		String str = new StringBuilder(data).reverse().toString();

		if (str.equals(data)) {
			return true;
		} else {
			return false;
		}
	}
}
