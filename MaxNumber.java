package com.bridgelab.generic;

public class MaxNumber<T extends Comparable> {

    //instance Variables
    T a, b, c, d, e;

    // constructor


    public MaxNumber(T a, T b, T c, T d, T e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Finding Maximum number program");

        new MaxNumber<Integer>(55, 95, 59, 50, 60).testMaximum();
        new MaxNumber<Float>(5.3f, 3.4f, 4.5f, 5.5f, 6.6f).testMaximum();
        new MaxNumber<String>("Apple", "Peach", "Banana", "Mango", "Greps").testMaximum();

    }

    public static <T extends Comparable> T findMaxNum(T a, T b, T c, T d, T e) {
        T max = a;

        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        if (d.compareTo(max) > 0)
            max = d;
        if (e.compareTo(max) > 0)
            max = e;

        System.out.println("Maximum Number : " + max);

        return max;
    }

    public void testMaximum() {
        MaxNumber.findMaxNum(a, b, c, d, e);
    }
}
