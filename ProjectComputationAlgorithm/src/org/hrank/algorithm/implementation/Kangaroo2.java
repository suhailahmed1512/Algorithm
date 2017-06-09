package org.hrank.algorithm.implementation;

import java.util.Scanner;

/**
 * Class to implement Kangaroo problem from Implementation
 * 
 * @author suhail-a
 * @version 1.0
 */
public class Kangaroo2 {
	
	/**
	 * DEVELOPER COMMENTS 
	 * NEED TO CHECK ON LOGIC PART AND USE SOME MORE TEST CASES
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		
		int jumpProd1, jumpProd2;
		
		if(x1==0 && v2!=0){
			jumpProd1 = v2;
		}else if(v2==0 && x1!=0){
			jumpProd1 = x1;
		}
		else{
			jumpProd1 = x1*v2;
		}
		
		
		if(x2==0 && v1!=0){
			jumpProd2 = v1;
		}else if(v1==0 && x2!=0){
			jumpProd2 = x2;
		}
		else{
			jumpProd2 = x2*v1;
		}
		
		/*System.out.println(jumpProd1 +" "+ jumpProd2);*/
		
		if(jumpProd2%jumpProd1==0){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		in.close();
	}
}
