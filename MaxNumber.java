package com.bridgelab.generic;

public class MaxNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Finding Maximum number program");

        MaxNumber maxIntValue = new MaxNumber();
        maxIntValue.findMaxNum(55, 95, 59);
    }
    public int findMaxNum(Integer a, Integer b, Integer c){
        Integer max = a;

        if (b.compareTo(max) > 0)
        max = b;
        if (c.compareTo(max) > 0)
        max = c;

        System.out.println("Maximun Number is : " + max);

        return max;
    }
}
