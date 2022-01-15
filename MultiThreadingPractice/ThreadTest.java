package MultiThreadingPractice;

//// A separate class for thread.
//class PracticeThread extends Thread{
//    public void run(){
//        int i=1;
//        while(true){
//            System.out.println(i +"Hello");
//            i++;
//        }
//    }
//}

public class ThreadTest extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i +"Hello");
            i++;
        }
    }
    public static void main(String[] args) {
//        PracticeThread t=new PracticeThread();
    ThreadTest t= new ThreadTest();
    t.start();
    int i=1;
    while(true){
        System.out.println(i+ "World");
    }
    }
}
