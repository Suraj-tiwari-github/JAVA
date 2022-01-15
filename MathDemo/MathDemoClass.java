package MathDemo;

public class MathDemoClass {
    public static void main(String[] args) {
//        System.out.println("absolute: "+ Math.abs(1));
//        System.out.println("StrictMath class" +StrictMath.abs(-123));
//
//        System.out.println("Cube Root: "+Math.cbrt(27));
//
//        System.out.println("Exact Decrement :"+Math.decrementExact(Integer.MIN_VALUE)); //* Here the value will not be
//        //* decrement and we reach the and its underflow.
//        int i=Integer.MIN_VALUE;
//        i--;
//        System.out.println(i); //* Positive value will be printed that is MAX_VALUE of Integer.

        System.out.println("Exponent Value in Floating Point Representation : ");
        System.out.println(Math.getExponent(25.9f));
    }

}
