package StringTokenizer_Demo;

import java.util.StringTokenizer;

public class StringTokenizer_demo {
    public static void main(String[] args) {
        String data = "name=suraj address=delhi country=india dept=CSE";


        //* our data is in key and value pair, The delimiter of our string is (= and semicolon).
        //* = is delimiter for key and value.
        //* each key and value is differentiate with ; (semi colon).

        //* here we are going to create a class of StringTokenizer.\
        StringTokenizer stk = new StringTokenizer(data, "= ");
        //* Delimiter as mention in the string, but StringTokenizer takes each character
        //* distinguish between them.

        String s;
        while (stk.hasMoreTokens()) {
            s = stk.nextToken();
            System.out.println(s);

        }
    }
}