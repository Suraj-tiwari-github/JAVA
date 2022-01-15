package MultiThreadingPractice;

class MyRunnableInterface implements Runnable{
    @Override
    public void run() {
        int i=1;
        while(true){
            System.out.println(i +"Hello");
            i++;
        }
    }
}

public class ThreadInterfacePractice implements  Runnable{
    @Override
    public void run() {

    }

    public static void main(String[] args) {
//        ThreadInterfacePractice t=new ThreadInterfacePractice();
        MyRunnableInterface t=new MyRunnableInterface();
        Thread th=new Thread(t);

        th.start();
        int i=1;
        while(true){
            System.out.println(i +" world");
            i++;
        }

    }
}
