package com.company;

public class Main {
    final static int max = 100;  //The number we wish to go up to. Only even numbers. But would be easy to do odd as well.

    public static void main(String[] args) {
        //Square of sum
        int squareSum = (max / 2) * max + max / 2;  //0+100 = 100, 1+99 = 100, 2+98=100...until 49+51 then we have 100 50 times. or (max/2) * max then 50 was added to anything so just add it + max/2
        squareSum *= squareSum;  //Then square it

        int sumSquare = 0;
        for (int i = 1; i < max + 1; i++) {  //Sum of squares. Iterate through each number to 100
            sumSquare += i * i;
        }
        System.out.println(squareSum - sumSquare);  //Print the difference

    }
}
