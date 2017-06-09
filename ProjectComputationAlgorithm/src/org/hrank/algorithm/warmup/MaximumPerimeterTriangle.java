package org.hrank.algorithm.warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class to implement maximum-perimeter-triangle algo. (degenerate triangles)
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class MaximumPerimeterTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int x = N - 3, y = N - 2, z = N - 1;

		for (; arr[x] + arr[y] <= arr[z]; x--, y--, z--) {
			// For Non-Degenerating triangle
			if (x == 0) {
				System.out.println("-1");
				sc.close();
				return;
			}
		}
		System.out.print(arr[x] + " " + arr[y] + " " + arr[z]);

		sc.close();
	}
}
