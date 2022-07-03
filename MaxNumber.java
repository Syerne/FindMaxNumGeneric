package com.bridgelab.generic;

public class MaxNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Finding Maximum number program");

        MaxNumber maxValue = new MaxNumber();
        maxValue.findMaxNum(55, 95, 59);
        maxValue.findMaxNum(2.3f, 3.4f, 4.5f);
        maxValue.findMaxNum("Apple", "Peach", "Banana");
    }

    public <T extends Comparable> T findMaxNum(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;

        System.out.println("Maximum Number : " + max);

        return max;
    }

   /* public Float findMaximum(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        System.out.println("Maximum Number in Float : " + max);

        return max;
    }

    public String findMaximum(String a, String b, String c) {
        String max = a;

        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;

        System.out.println("Maximum String in String : " + max);

        return max;
    }*/
}
