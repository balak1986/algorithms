package edu.algorithms.fundamentals;

/*
 * Quick-union defect.
 * Trees can get tall.
 * Find too expensive (could be N array accesses).
 */
public class QuickUnionUF implements UF {
	private int[] id;

	public QuickUnionUF(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}

	private int root(int c) {
		while (c != id[c]) {
			c = id[c];
		}
		return c;
	}

	/**
	 * Check if p and q have the same root.
	 */
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	/**
	 * To merge components containing p and q, set the id of p's root to the id
	 * of q's root
	 * 
	 * @see edu.algorithms.fundamentals.UF#union(int, int)
	 */
	public void union(int p, int q) {
		int pRoot = root(p);
		int qRoot = root(q);
		id[pRoot] = qRoot;
	}

}
