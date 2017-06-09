package org.hrank.algorithm.string;

public class Pafrser {

	boolean isBalanced(String data) {
		while (data.length() != (data = data.replaceAll("\\(\\)|\\{\\}|\\[\\]", "")).length())
			;

		return data.isEmpty();
	}

	boolean compare(String a, String b) {
		return (a.equals(b) ? true : false);
	}

	boolean compare(int[] a, int[] b) {
		boolean result = false;
		if (a.length == b.length) {
			
			for(int i=0; i<a.length; i++){
				if(a[i]!=b[i]){
					return false;
				}else{
					result = true;
				}
			}
		}
		
		return result;
	}

}
