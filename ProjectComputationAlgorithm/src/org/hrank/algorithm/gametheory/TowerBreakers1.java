package org.hrank.algorithm.gametheory;

import java.util.Scanner;

/**
 * Class to implement tower-breakers-1 algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class TowerBreakers1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {

			int N = sc.nextInt();
			int M = sc.nextInt();
			if (M == 1 && N % 2 == 0) {
				System.out.println(1);
			} else if (M == 1 && N % 2 != 0) {
				System.out.println(2);
			} else {
				System.out.println(N % 2 == 0 ? 2 : 1);
			}
		}

		sc.close();
	}
}
