package BitSet_Demo.java;

import java.util.BitSet;
public class BitSetDemo {
    public static void main(String[] args) {
        //* BitSet class doesn't implements Collection interface. It is a separate class.
        BitSet bs= new BitSet();
        bs.set(0);
        //* we are setting only the even bits, we are avoiding the Odd bits.
        //* when we are setting the bits then bit will 101010101 Even bits are 1 and odds bits are 0.
        bs.set(2);
        bs.set(4);
        bs.set(6);
        bs.set(8);

        System.out.println(bs);
        System.out.println(bs.get(1)); //* Output: false.
        BitSet bs2=new BitSet();
        bs2.set(0);
        bs2.set(1);
        bs2.set(2);
        bs2.set(3);
        bs2.set(4);
        bs2.set(5);
        bs2.set(6);
        bs2.set(7);
        bs2.set(8);

        bs.and (bs2);

        System.out.println(bs);
        bs.or(bs2);
        System.out.println(bs);
    }
}
