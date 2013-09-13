/**
 * 
 */
package edu.algorithms.fundamentals;

import java.util.Arrays;

/**
 * @author krishnam
 * 
 */
public class WeightedQuickUnionUFTest {

    /**
     * 
     */
    public WeightedQuickUnionUFTest() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // 1-5 9-7 5-2 1-0 8-3 8-7 0-9 5-4 6-1
        WeightedQuickUnionUF wuf = new WeightedQuickUnionUF(10);
        wuf.union(0, 1);
        System.out.println(" Id: " + Arrays.toString(wuf.getId()));
        System.out.println(" Size: " + Arrays.toString(wuf.getSize()));

        wuf.union(5, 7);
        System.out.println(" Id: " + Arrays.toString(wuf.getId()));
        System.out.println(" Size: " + Arrays.toString(wuf.getSize()));

        wuf.union(6, 8);
        System.out.println(" Id: " + Arrays.toString(wuf.getId()));
        System.out.println(" Size: " + Arrays.toString(wuf.getSize()));

        wuf.union(7, 8);
        System.out.println(" Id: " + Arrays.toString(wuf.getId()));
        System.out.println(" Size: " + Arrays.toString(wuf.getSize()));

        wuf.union(1, 3);
        System.out.println(" Id: " + Arrays.toString(wuf.getId()));
        System.out.println(" Size: " + Arrays.toString(wuf.getSize()));

        wuf.union(3, 4);
        System.out.println(" Id: " + Arrays.toString(wuf.getId()));
        System.out.println(" Size: " + Arrays.toString(wuf.getSize()));

        wuf.union(0, 7);
        System.out.println(" Id: " + Arrays.toString(wuf.getId()));
        System.out.println(" Size: " + Arrays.toString(wuf.getSize()));

        wuf.union(6, 9);
        System.out.println(" Id: " + Arrays.toString(wuf.getId()));
        System.out.println(" Size: " + Arrays.toString(wuf.getSize()));

        wuf.union(4, 2);
        System.out.println(" Id: " + Arrays.toString(wuf.getId()));
        System.out.println(" Size: " + Arrays.toString(wuf.getSize()));
        
//
//            0 1 2 3 4 5 6 7 8 9 
//      1-5:  0 1 2 3 4 1 6 7 8 9 
//      9-7:  0 1 2 3 4 1 6 9 8 9 
//      5-2:  0 1 1 3 4 1 6 9 8 9 
//      1-0:  1 1 1 3 4 1 6 9 8 9 
//      8-3:  1 1 1 8 4 1 6 9 8 9 
//      8-7:  1 1 1 8 4 1 6 9 8 8 
//      0-9:  1 1 1 8 4 1 6 9 1 8 
//      5-4:  1 1 1 8 1 1 6 9 1 8 
//      6-1:  1 1 1 8 1 1 1 9 1 8 
    }
}
