package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement bon-appetit algo
 * @author suhail-a
 * @version 1.0
 *
 */
public class BonAppetit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++){
			arr[i] = sc.nextInt();
		}
		
		int bCharged = sc.nextInt();
		
		int bActual = 0;
		
		for(int i=0; i<N; i++){
			if(i!=K){
				bActual += arr[i];
			}
		}
		
		if((bActual/2)==bCharged){
			System.out.println("Bon Appetit");
		}else{
			System.out.println(bCharged - (bActual/2));
		}
		
		sc.close();
	}
}
