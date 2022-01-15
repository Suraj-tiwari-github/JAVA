package ReflectionDemo;
import java.lang.reflect.*;

class My{
    private int a;
    public int b;
    protected int c;
    int d;

    public My(){ }

    public My(int a , int b){ }

    public My(int f, int g, int i, int j){ }

    //Methods now
    private void getName(){

    }

    public void setName(){ }

    protected void tonull(){ }


}

public class ReflectDemo {
    public static void main(String[] args) {
        Class c = My.class;  //* My is a class and when we compiled class Named My(). the .class file will be created.
        System.out.println(c.getName()); // give the name of the class

        Field field []=c.getDeclaredFields(); //* Field is also a class which contains all the variable of our class.
        //getDeclaredFields return all the fields of our class

        //printing all the fields of our class.
        for(Field f:field){
            System.out.println(f);
        }
        System.out.println();
        // Constructor is also a Class which will contain all the constructor of our class.
        Constructor con[]=c.getConstructors();

        //priting all the constructor with foreach loop.
        for(Constructor ct: con){
            System.out.println(ct);
        }
        System.out.println();
        //* now methods class.
        Method method[]=c.getMethods(); //* we'll every method because Object class is a parent class of all the classes
        //* so Object methods will also get displayed.
        for(Method m:method){
            System.out.println(m);

        }


    }
}
