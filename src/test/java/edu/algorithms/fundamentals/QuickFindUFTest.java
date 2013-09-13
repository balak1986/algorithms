package edu.algorithms.fundamentals;

import java.util.Arrays;

public class QuickFindUFTest {
    public static void main(String[] args) {
        QuickFindUF quickFindUF = new QuickFindUF(10);
        quickFindUF.union(5, 0);
        System.out.println(Arrays.toString(quickFindUF.getId()));
        quickFindUF.union(1, 9);
        System.out.println(Arrays.toString(quickFindUF.getId()));
        quickFindUF.union(5, 3);
        System.out.println(Arrays.toString(quickFindUF.getId()));
        quickFindUF.union(8, 3);
        System.out.println(Arrays.toString(quickFindUF.getId()));
        quickFindUF.union(5, 2);
        System.out.println(Arrays.toString(quickFindUF.getId()));
        quickFindUF.union(7, 5);
        System.out.println(Arrays.toString(quickFindUF.getId()));
        // [2, 1, 2, 2, 2, 2, 6, 7, 2, 2]
    }
}
