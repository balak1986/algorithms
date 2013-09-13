package edu.algorithms.fundamentals;

/*
 * Quick-union defect.
 * Trees can get tall.So use weight to change parent 
 */
public class WeightedQuickUnionUF implements UF {
    // to store parent id
    protected int[] id;
    private int[] size;

    public WeightedQuickUnionUF(int N) {
        id = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            // initial size
            size[i] = 1;
        }
    }

    private int root(int i) {
        // root
        while (i != id[i]) {
            // get parent of i
            i = id[i];
        }
        return i;
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
        // when joining two trees of equal size, our weighted quick union
        // convention
        // is to make the root of the second tree point to the root of the first
        // tree.
        if (size[pRoot] >= size[qRoot]) {
            // p root has more nodes , make q as sub tree .ex try 1-5, 2-5
            id[qRoot] = pRoot;
            // increase by q sub tree size
            size[pRoot] += size[qRoot];
        } else {
            id[pRoot] = qRoot;
            size[qRoot] += size[pRoot];
        }
    }

    public int[] getId() {
        return id;
    }

    public int[] getSize() {
        return size;
    }

}
