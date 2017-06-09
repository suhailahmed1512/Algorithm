package org.hrank.algorithm.gt;

import java.util.Scanner;

/**
 * Class to implement even-tree algo.
 * 
 * @author suhail-a
 * @version 1.0
 * 
 */
public class EvenTree {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // no. of vertices.
		int m = scan.nextInt(); // no. of edges
		boolean[][] edges = new boolean[n + 1][n + 1];
		int[] edgeCount = new int[n + 1];
		boolean[] removable = new boolean[n + 1];
		for (int i = 0; i < m; i++) {
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			edges[v1][v2] = true;
			edges[v2][v1] = true;
			edgeCount[v1]++;
			edgeCount[v2]++;
		}

		// initialize removable
		for (int i = 1; i <= n; i++) {
			if (edgeCount[i] > 1)
				removable[i] = true;
		}

		int edgeRemovedCount = 0;
		boolean change = true;
		while (change) {
			change = false;
			for (int i = 1; i <= n; i++) {
				// check each vertex
				if (removable[i]) {
					if (edgeCount[i] == 1) {
						removable[i] = false;
						change = true;
					} else {
						int removableNeighbor = -1;
						int count = 0;
						for (int j = 1; j <= n; j++) {
							if (edges[i][j] && removable[j]) {
								count++;
								if (count == 1)
									removableNeighbor = j;
								else
									break;
							}
						}
						if (count == 0) {
							removable[i] = false;
							change = true;
						} else if (count == 1) {
							if (edgeCount[i] % 2 == 0) {
								change = true;
								edges[i][removableNeighbor] = false;
								edges[removableNeighbor][i] = false;
								edgeCount[i]--;
								edgeCount[removableNeighbor]--;
								edgeRemovedCount++;
								// System.out.println("removing: "+i+"
								// "+removableNeighbor);
							} else {
								removable[i] = false;
								change = true;
							}
						}
					}
				}
			}
		}

		System.out.println(edgeRemovedCount);
		scan.close();
	}
}
