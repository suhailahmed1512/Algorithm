package org.hrank.algorithm.string;

public class TTT {

	public static void main(String[] args) {

		System.out.println(isBalanced("{}"));
	}

	static boolean isBalanced(String data) {

		int length = data.length();
		while (length > (length = data.replaceAll("\\{\\}\\[\\]\\(\\)", "").length()))
			;
		return data.isEmpty();
	}
}
