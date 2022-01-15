package WrapperClasses_Demo;

import java.util.Arrays;

public class WrapperDemo {
    Float f=Float.valueOf("123.45"); //* f is the object of class Float. Converting a string into float type of value

    float x=f.floatValue(); //x is the primitive float, and we are converting the float object value to float primitive
    //* line 6 is called UNBOXING.

    float y=f; // Writing f will automatically called floatValue(); method and convert it into the float primitive type
    /* value
    * line 9: the process of doing operation like this, we'll called as AUTO UNBOXING */

    Integer i=Integer.valueOf(1); // writing in this way, this process is called as BOXING
    int m=10;
    Integer n=m; // AUTO BOXING
    int p=i; // AUTO UNBOXING.

    public static void main(String[] args) {
        int m1=15;
        Integer m2=Integer.valueOf("123");
        Integer m3=Integer.valueOf("A845", 16); //* Hexadecimal value will be converted into Integer value.
        Integer m4=Integer.decode("0xA7"); //* Decode is also a method to convert into different numbers system.

//        System.out.println(m2.equals(m3));
//        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("m3 = " + m3);
        System.out.println("m4 = " + m4);
//        System.out.println("m3 = " + m3);

        Float b=(float)Math.sqrt(-1); //* Sqrt of -1 is an imaginary number.
        System.out.println("b = " + b.isNaN());
    }


}
