package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement Jumping On The Clouds game algorithm in a minimal complex
 * way
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class JumpingOnTheClouds {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}

		System.out.println(getStepsCount(c, k));

		// Freeing up the resources
		in.close();
	}

	/**
	 * Method to count the steps to complete the game
	 * 
	 * @param c
	 * @return
	 */
	static int getStepsCount(int c[], int k) {

		int count = 100;
		for (int i = 0; i < c.length; i=i+k) {
			
			if(c[i]==0){
				count = count - 1;
			}else{
				count -= 3;
			}

		}
		return count;
	}
}
