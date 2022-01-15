package MultiThreadingPractice;
//* Now assigning names to the thread which is been inherited by the class. from the main method.
class MyThread extends Thread{
//    Constructor.
//    public MyThread(String name){
////        passing the thread name to the thread class, where thread class is a super class of
////        MyThread class.
//        super(name);
//        setPriority(Thread.MAX_PRIORITY);
//    }

    public void run(){
        for(int i=1; i>0; i++)
            System.out.println("My Thread : "+i);
    }

}
//class myRun implements Runnable {
//    public void run() {
//        int count = 1;
//        while (true) {
//            System.out.println(count++);
//            try {
//                // calling sleep method which is a static method.
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//        }
//    }
//}
public class ThreadClassPractice {
    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread();
        t.start();
        for (int i = 1; i > 0; i++) {
            System.out.println("My Thread : " + i);
            Thread.yield();


////        Daemon thread example.
//        t.setDaemon(true);
//        t.start();
//
//        //* taking the reference of the current threat.
//        Thread mainThread =Thread.currentThread();
//        mainThread.join();
//        try{Thread.sleep(1 );} catch(Exception e){}


//        Thread t=new Thread("My Thread");
//
//        //* Now passing an object to the runnable interface
//        Thread t1=new Thread(new myRun(), "My Thread1");
//        myRun t4= new myRun();
//        Thread th1=new Thread(t4);
//        th1.start();
//        //* Interrupt will won't let the thread to sleep, It will interrupt when the thread goes to sleep.
//        th1.interrupt();
//
//        MyThread t3=new MyThread("MyNewThread");
//        System.out.println("ID "+ t3.getId());
//        System.out.println("Name "+t3.getName());
//        System.out.println("Priority "+t3.getPriority());
//        t3.start();
//        System.out.println("State "+t3.getState());
//        System.out.println("Alive "+t3.isAlive());

        }
    }
}
