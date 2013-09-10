/**
 * 
 */
package edu.algorithms.fundamentals;

import edu.algorithms.stdlib.StdIn;

/**
 * Takes N 2 array accesses to process sequence of N union commands on N
 * objects.
 * 
 * @author bala
 * 
 */
public class QuickFindUF implements UF{
	private int[] id;

	public QuickFindUF(int N) {
		// create array with value as index
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}

	// connected if values are same
	public boolean connected(int p, int q) {
		return (id[p] == id[q]);
	}

	// To merge components containing p and q, change all entries
	// whose id equals id[p] to id[q].
	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		for (int i = 0; i < id.length; i++) {
			if (id[i] == pid) {
				id[i] = qid;
			}
		}
	}

	public static void main(String[] args) {
		int N = StdIn.readInt();
		QuickFindUF uf = new QuickFindUF(N);

		// read in a sequence of pairs of integers (each in the range 0 to N-1),
		// calling find() for each pair: If the members of the pair are not
		// already
		// call union() and print the pair.
		while (!StdIn.isEmpty()) {
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if (uf.connected(p, q))
				continue;
			uf.union(p, q);
			System.out.println(p + " " + q);
		}
		System.out.println(uf.id);
	}
}
