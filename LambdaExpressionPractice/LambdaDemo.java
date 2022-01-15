package LambdaExpressionPractice;
@FunctionalInterface
interface MyLambda{
    // Interface methods are public and abstract.
    public void display(String str);
}
@FunctionalInterface
interface MyLambda1{
    public int add(int x, int y);
        }

@FunctionalInterface
interface MyLambda2{
    public void display();
}

class Demo{
    int temp=10;
    public void method1(){
        int result=0;

        MyLambda2 ml=()->{
            System.out.println("hi");
            System.out.println("Bye");
            int count=9;
            System.out.println(++count);
            // accessing method variable
            System.out.println(result);
            // modification of result variable.
            System.out.println();

        };
        ml.display();
    }

    public void method2(){
        UseLambda ul=new UseLambda();
        ul.callLambda(()-> System.out.println("Hello method 2 to lambda"));
    }
}

class UseLambda{
    public void callLambda(MyLambda2 ml){
        ml.display();
    }
}
public class LambdaDemo {

    public static void reverse(String str){
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
    public static void main(String[] args) {
        // it is an anonoymous Method and acting as an object.
        System.out.println("C:\\xyz\\abc.txt");
        MyLambda ob= System.out::println;
        ob.display("Java programming");

        MyLambda1 o=(a,b)->a+b;
        int result=o.add(2,3);
        System.out.println(result);

        Demo d=new Demo();
        d.method1();
        d.method2();

        MyLambda n=LambdaDemo::reverse;
        n.display("Suraj Tiwari is doing Lambda Reference");
    }
}
