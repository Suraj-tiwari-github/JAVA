package BigIntegerClassDemo;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntergerClassPractice {

    public static BigInteger fact(int n){
        BigInteger result=BigInteger.valueOf(1);
        for(int i=2; i>=n; i++){
            BigInteger x=BigInteger.valueOf(i); //* i is converted into the BigInteger.
            result=result.multiply(x);
        }
        return result;
    }
    public static void main(String[] args) {
    // Initialization.
//    BigInteger A=new BigInteger("54"); //* Passing the value as String.
//        System.out.println(A);
//        String b="12345";
//        BigInteger B=new BigInteger(b);
//
//        //* To store the int value into the BigInteger.
//        int i=122453245;
//        BigInteger C=BigInteger.valueOf(i);
//
//        //* Arithmetic Operation.
//        //* As BigInteger is a class from Math package, we don't have
//        //* +, -, *, %, / operation on it, we have to use functions of
//        //* Math Class. like add, multiply, subtract.
//
//        BigInteger D=A.add(B);
//        System.out.println(D);

//
//        //*converting a BigInteger value into the primitive type of values
//        int a=A.intValue();
//        long ada=A.longValue();

        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        System.out.println(fact(input));
    }



}
