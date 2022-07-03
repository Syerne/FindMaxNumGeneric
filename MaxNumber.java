package com.bridgelab.generic;

public class MaxNumber<T extends Comparable> {

    //instance Variables
    T a, b, c;

    // constructor
    public MaxNumber(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Finding Maximum number program");

        new MaxNumber<Integer>(55, 95, 59).testMaximum();
        new MaxNumber<Float>(2.3f, 3.4f, 4.5f).testMaximum();
        new MaxNumber<String>("Apple", "Peach", "Banana").testMaximum();

    }

    public static <T extends Comparable> T findMaxNum(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;

        System.out.println("Maximum Number : " + max);

        return max;
    }

    public void testMaximum() {
        MaxNumber.findMaxNum(a, b, c);
    }
}
