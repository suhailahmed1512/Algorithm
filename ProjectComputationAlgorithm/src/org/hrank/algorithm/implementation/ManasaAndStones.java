package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement manasa-and-stones algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class ManasaAndStones {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == b)
				System.out.print((n - 1) * a);
			else {
				if (a > b) {
					int temp = a;
					a = b;
					b = temp;
				}
				for (int i = 0; i < n; i++)
					System.out.print(i * b + (n - 1 - i) * a + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
