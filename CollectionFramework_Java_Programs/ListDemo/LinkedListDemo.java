package CollectionFramework_Java_Programs.ListDemo;
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> lli=new LinkedList<>();
        lli.add(10);
//        lli.add(5,50);
        lli.addFirst(0);
        lli.addLast(60);
        lli.add(20);
        lli.add(30);
        lli.add(40);

        System.out.println(lli);

        lli.forEach(n->System.out.println(n));
        //* pollFirst() will remove the first element, poll() is for removing it.

    }
}
