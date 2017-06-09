package org.hrank.algorithm.string;


/**
 * Class to implement check on basic complexity of StringBuilder API
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class BuilderCheck {

	public static void main(String[] args) {

/*		Scanner sc = new Scanner(System.in);

		String str = sc.next();*/

		StringBuilder data = new StringBuilder("0123");
		/*data  = data.deleteCharAt(0);*/
		System.out.println(data.deleteCharAt(1));
		/*for (int i = 0; i < 1; i++) {

			if (data.charAt(i) == '9') {
				System.out.println("BEFORE CHECK AT postion " + i + " data is "
						+ data);
				System.out.println("LENBGTH BEFOR DELETE "+ data.length());
				data.deleteCharAt(i);
				System.out.println("LENBGTH AFTERE DELETE "+ data.length());
				data.replace(i, i, String.valueOf('P'));
				System.out.println("LENBGTH AFTERE APPOEND "+ data.length());
				System.out.println("AFTER CHECK AT postion " + i + " data is "
						+ data);
			}

		}*/
	}
}
