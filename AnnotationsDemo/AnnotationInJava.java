package AnnotationsDemo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

abstract class Parent{
    abstract public void display();
}

class Child extends Parent{
   @Override
    public void display(){

    }
}

class Oldclass{
    public void display(){
        System.out.println("Hello");
    }
    @Deprecated
    public void show(){
        System.out.println("Hi");
    }
}

//@Target(value="ElementType.LOCAL_VARIABLE")

@interface MyAnno{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
}

@MyAnno(name="Ajay" , project="MyProject")
public class AnnotationInJava {
    public static void main(String[] args) {
        Oldclass b=new Oldclass();


    }
}
