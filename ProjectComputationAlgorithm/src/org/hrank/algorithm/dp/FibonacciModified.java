package org.hrank.algorithm.dp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class to implement modified Fibonacci algo. with approach of Dynamic Programming
 * @author suhail-a
 * @version 1.0
 *
 */
public class FibonacciModified {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger t1 = new BigInteger(sc.next());
		BigInteger t2 = new BigInteger(sc.next());
		BigInteger n = new BigInteger(sc.next());
		
		BigInteger t3 = new BigInteger("0");
		List<BigInteger> list = new ArrayList<BigInteger>();
		list.add(t1);
		list.add(t2);
		for(BigInteger i=t1; !i.equals(n); i=i.add(BigInteger.ONE)){
			
			t3 = t1.add(t2.pow(2));
			list.add(t3);
			//System.out.print(t3+"\t");
			t1=t2;
			t2=t3;
		}
		
		System.out.println(list.get(n.intValue()-1));
		sc.close();
	}
	
	
}
