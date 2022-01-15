package CollectionFramework_Java_Programs.ListDemo;
import java.util.*;
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>(20);

        ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80,90));
        //* List.of is a static interface in List. We are directly assining the new values in it.

        al1.add(30);
        al1.add(0,10);
        //* adding all the elements of al2 into the al1.

        al1.addAll(0,al2);

        System.out.println(al1);

        System.out.println(al1.contains(25));
        //* get will give us a value of index.
        System.out.println(al1.get(5));

        System.out.println(al1.indexOf(70));
        al1.add(2,70);

        //* let get the 2nd element of 70.

        //printing all the elements give a regular for-loop.
        System.out.println();
        for(int i=0; i<al1.size(); i++){
            System.out.println(al1.get(i));
        }

        //for each loop.
        System.out.println("Using a For-each loop");
        for(Integer x: al1){
            System.out.println(x);
        }

        //* Iterator.
        System.out.println("\n\n Using Iterator");
        Iterator<Integer> it=al1.iterator(); //* every object contains a iterator.
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\n\n Using ListIterator");
        ListIterator<Integer> it1=al1.listIterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
            //* The ListIterator is Bidirectional, it can traverse in both directions.
        }

        // now converting the while loop into the for loop with ListIterator.
        System.out.println("\n\n Using forLoop List Iterator");
        for(ListIterator<Integer> it2=al1.listIterator(); it2.hasNext(); ){
            System.out.println(it2.next());
        }

        // Enhance for-loop
        System.out.println("Enhance for-loop");
        for(Integer integer:al2){
            System.out.println(integer);
        }

        // List element have a enhance for loop which can be used with
        // lambda expression.
        System.out.println("Lambda For=Each");
        al1.forEach(n->System.out.println(n));

        //* can also be used as
        al1.forEach(System.out::println);

        //* List has a for each method and we are using a lambda expression and calling show method
        // for every element and priting only if the element is greater than 60.
        al1.forEach(y->show(y));

    }

    static void show(int n){
        if(n>60){
            System.out.println(n);
        }
    }
}
