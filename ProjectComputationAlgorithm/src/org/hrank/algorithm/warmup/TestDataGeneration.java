package org.hrank.algorithm.warmup;

public class TestDataGeneration {

	public static void main(String[] args) {
		
		/*Long data = Long.valueOf((long) Math.pow(10, 5));*/
		int limit = Long.valueOf((long)(Math.pow(10, 5))).intValue();
		for(int i=1; i<=limit; i++){
			System.out.print(i+"\t");
		}
	}
}
