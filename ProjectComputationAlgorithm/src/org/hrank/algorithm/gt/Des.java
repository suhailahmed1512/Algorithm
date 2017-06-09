package org.hrank.algorithm.gt;

import java.util.Scanner;

public class Des {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        long n = sc.nextLong();
	        long m = sc.nextLong();
	        long c = sc.nextLong();
	        
	        long toalCitiesPossible = (n-c)+(m-c)+c;
	       // System.out.println(toalCitiesPossible);
	        long total = 1;
	        for(long i=toalCitiesPossible-1; i>0; i--){
	            
	            total*=i;
	        }
	        System.out.println(total);
	        sc.close();
	}
}
