package com.company;

/**
 * Man there's always a better way! lol mathmagical.
 */
public class Alt {
    public static void main(String[] args) {
        //So there's formulas out there for these kinds of things.
        //Sum of squares of natural numbers
        //1^2 + 2^2 +3^2...(n^2 = n*(n+1)*(2n+1))/6
        int n = 100;
        int sum = (n * (n + 1)) / 2;
        System.out.println(sum * sum - (sum * ((2 * n + 1) / 3)));
    }
}
