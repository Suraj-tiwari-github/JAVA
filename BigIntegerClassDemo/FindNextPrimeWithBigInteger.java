package BigIntegerClassDemo;

import java.math.BigInteger;
import java.util.Scanner;

public class FindNextPrimeWithBigInteger {

    public static boolean isPrime(int n){
        BigInteger b= BigInteger.valueOf(n); //* converting int into the boolean value.
        return b.isProbablePrime(1); //* certainty given here is one. return true or false.
    }

    public static int nextPrime(int n){
        BigInteger b=BigInteger.valueOf(n);
        //* the Big Integer return a value of BigInteger, so we are converting into the string.
        String a=b.nextProbablePrime().toString(); //* here b contain the prime and nextProbablePrime
        //* will find the next prime number for example, if the given number is 13, so the next prime number will be
        //* 17.
        return Integer.parseInt(a);
    }
    public static void main(String[] args) {
        //* BigInteger has already some functions to check the number is prime or not.
        //* It even contains a method which tells the next prime after the number which we are given.

        //* isProbablePrime(int certainity) -> gives true or false based on prime condition.
        //* nextProbablePrime(); //* Gives next prime value.


        //*
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPrime(n));
        System.out.println(nextPrime(n));

    }
}
