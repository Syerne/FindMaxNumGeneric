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

        /*MaxNumber<Integer> maxValue = new MaxNumber<Integer>(55, 95, 59);
        purpose object creation and constructor call
        above concept helps to below steps*/

        new MaxNumber<Integer>(55, 95, 59).toPrint();
        new MaxNumber<Float>(2.3f, 3.4f, 4.5f).toPrint();
        new MaxNumber<String>("Apple", "Peach", "Banana").toPrint();

        //new MaxNumber<String>("Apple", "Peach", "Banana").findMaxNum("a", "c", "d");

    }

    // generic inherit properties & compare
    public <T extends Comparable> T findMaxNum(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;

        System.out.println("Maximum Number : " + max);

        return max;
    }

    // purpose print & call compare method
    // directly call the findMaximum in main method need to parameter again passed and no used of constructor
    public void toPrint(){
        findMaxNum(a, b, c);
    }
}
