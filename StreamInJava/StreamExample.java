package StreamInJava;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        int arr[]={30,20,10};
        double max=Arrays.stream(arr).average().getAsDouble();
        System.out.println(max);

        Stream.iterate(1,x->x+1)
                .filter(x->x.toString().contains("5"))// the first filter should be pass in order to execute the next statement.
                .limit(10) //here the limit which we are given is 10 , so 10 numbers will be printed.
                .forEach(System.out::println);
    }
}
