package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * CLass to implement utopian-tree algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class UtopianTree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			System.out.println(getTreeHeight(sc.nextInt()));
		}

		sc.close();
	}

	/**
	 * Method to get the tree height
	 * 
	 * @param cycles
	 * @return
	 */
	static long getTreeHeight(int cycles) {

		long height = 1;

		if (cycles == 0)
			return 1;
		else if (cycles == 1)
			return 2;
		else {
			int i = 1;
			boolean isGoingtoAdded = false;
			while (i <= cycles) {
				if (isGoingtoAdded) {
					height += 1;
					isGoingtoAdded = false;
				} else {
					height *= 2;
					isGoingtoAdded = true;
				}
				i++;
			}

			return height;
		}
	}
}
