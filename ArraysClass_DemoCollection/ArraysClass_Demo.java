package ArraysClass_DemoCollection;

import java.util.Arrays;

public class ArraysClass_Demo {
    public static void main(String[] args) {
        int a[]={2,4,6,8,1,3,5,7};
        int b[]={2,4,6,1,3,5,7};

        System.out.println(Arrays.compare(a,b));
        /*
        * if array a is greater than it will return 1
        * If array b is greater than it will return -1
        * if both the array is equal then it will return 0.
        * */

        int c[]=Arrays.copyOf(a,4);
            //* this will copy from index 0 to index 3.

        for(int x:c)
            System.out.print(x+ " ");

        int temp[]=Arrays.copyOf(a,b.length);
        //* total array of b will be copied in temp.
        for(int x: temp){
            System.out.print(x +" ");
        }


        Arrays.fill(temp,-1); //* Fill function will fill
        // every value in the array with -1
        for(int x: temp){
            System.out.print(x +" ");
        }

        Arrays.sort(a);
        Arrays.parallelSort(b);

        System.out.println(Arrays.binarySearch(a,5));
        //* Arrays have a method called binarySearch.

    }
}
