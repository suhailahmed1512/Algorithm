package org.hrank.algorithm.gametheory;

import java.util.Scanner;

/**
 * CLass to implement game-of-stones-1 algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class GameOfStones1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			System.out.println(sc.nextInt() % 7 < 2 ? "Second" : "First");
		}
		sc.close();
	}
}
