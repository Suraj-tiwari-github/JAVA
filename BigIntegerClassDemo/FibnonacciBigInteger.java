package BigIntegerClassDemo;

import java.math.BigInteger;
import java.util.Scanner;

public class FibnonacciBigInteger {

    public static BigInteger fib(int n){
        BigInteger a=BigInteger.valueOf(0);
        BigInteger b=BigInteger.valueOf(1);
        BigInteger c;

        for(int i=2; i<=n ; i++){
            c=a.add(b);
            a=b;
            b=c;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        System.out.println(fib(input));
    }
}
