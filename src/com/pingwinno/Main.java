package com.pingwinno;

import java.math.BigInteger;
//This app calculate sum of digits in the number 100!
public class Main {
    static int calculateFactorial(int n) {
        //Use BigInteger to fit factorial value
        BigInteger factorial = BigInteger.valueOf(n);
        //Calculate factorial
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        String[] digits = factorial.toString().split("");
        int result = 0;
        for (String digit : digits) {
            result = result + Integer.valueOf(digit);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(100));
    }
}