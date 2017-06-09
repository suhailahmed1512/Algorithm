package org.hrank.algorithm.string;

import java.util.Scanner;

public class T {
	public static void main(String[] args) {

		Pafrser p = new Pafrser();
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			System.out.println(p.isBalanced(sc.next()));
		}
	}

}
