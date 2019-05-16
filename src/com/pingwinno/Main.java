package com.pingwinno;

import java.math.BigInteger;
//This app calculate sum of digits in the number 100!
public class Main {
    static int calculateFactorial(int n) {
        //BigInteger used to fit factorial value
        BigInteger factorial = BigInteger.valueOf(n);
        //Calculate factorial
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        //Split factorial string to digits array
        String[] digits = factorial.toString().replaceAll("0","").split("");
        int result = 0;
        //Parse digits to int and calculate sum of it
        for (String digit : digits) {
            result = result + Integer.valueOf(digit);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(100));
    }
}