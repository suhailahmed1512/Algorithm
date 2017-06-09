package org.hrank.algorithm.string;

import java.util.Scanner;

/**
 * Class to implement Reduced String Algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class ReducedString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		StringBuilder data = new StringBuilder(str);

		for (int i = 1; i < data.length(); i++) {

			if (data.charAt(i) == data.charAt(i - 1)) {
				//System.out.println(data.charAt(i)+" is chracter at"+ i + " and "+ data.charAt(i-1)+" is character at "+(i-1));
				/*System.out.println("DATA BEFOR DELETE "+ data);*/
				data.delete(i - 1, i + 1);
				/*System.out.println("DATA AFTER DELETE "+ data);*/
				
				// Re-initializing string index to start poistion
				i = 0;
			}
		}

		if (data.length() != 0) {
			System.out.println(data.toString());
		} else {
			System.out.println("Empty String");
		}
		
		//Freeing the resources
		sc.close();
	}
}
