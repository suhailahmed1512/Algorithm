package org.hrank.algorithm.string;

import java.util.Scanner;

/**
 * Class to implement Making-Anagrams algo. with complexity O(n) in time
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class MakingAnagrams {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String A = sc.next();
		String B = sc.next();

		int[] tempArr = new int[26];

		for (int i = 0; i < A.length(); i++) {
			tempArr[A.charAt(i) - 97]++;
		}

		for (int i = 0; i < B.length(); i++) {
			tempArr[B.charAt(i) - 97]--;
		}

		int count = 0;
		for (int i = 0; i < 26; i++) {
			/*System.out.println("Value of temp at "+i +" is "+tempArr[i] );*/
			count += Math.abs(tempArr[i]);
			/*System.out.println("Counte Value is "+count);*/
		}

		System.out.println(count);

		// Freeing up the resources
		sc.close();
	}
}
