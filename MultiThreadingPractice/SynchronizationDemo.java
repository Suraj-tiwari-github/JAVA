package MultiThreadingPractice;

class MyData{
    public void display(String str) {

            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }

    }
}
class MyThread1 extends Thread{
    MyData d;
    public MyThread1(MyData d){
        this.d=d;
    }
    //* overriding the run method.
    public void run(){
        d.display("Hello world");
    }
}
class MyThread2 extends Thread{
    MyData d;
    public MyThread2(MyData d){
        this.d=d;
    }
    //* overriding the run method.
    public void run(){
        d.display("Welcome All");
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        MyData d=new MyData();
        MyThread1 t1=new MyThread1(d);
        MyThread2 t2=new MyThread2(d);
        t1.start();
        t2.start();
    }
}
