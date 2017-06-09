package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement sherlock-and-the-beast algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class SherlockAndTheBeast {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++){
			
			getClue(sc.nextInt());
		}
		
		sc.close();

	}
	
	/**
	 * Method to find sherlock's clue number
	 * @param N
	 */
	static void getClue(int N){
		
		int y, z;
		y=N; 
		z=y;
		while(z%3!=0){
			z-=5;
			if(z<0){
				z=-1;
			}else{
				z = z*5+(y-z)*3;
			}
		}
		
		System.out.println(z);
			
	}
}
