package MultiThreadingPractice;

class MyData1{
    int value;
    boolean flag=true;
    // If true then it is producer turns
    // if false then it is consumer turns.
    synchronized public void set(int v) {
        while (flag != true) {
            try {
                wait(); //* wait() will wait for only few milliseconds and again it will
//        change state from waiting state to running state, need to put in loop.
            } catch (Exception e) {
            }
        }
            value = v;
            flag = false;
            notify();
        }

        synchronized public int get () {
            int x = 0;
            while(flag!=false)
                    try{wait(); }catch(Exception e){ }

            x = value;
            flag=true;
            notify();
            return x;
        }
    }


class Producer extends Thread{
    MyData1 data;
    public Producer(MyData1 d){
        data=d;
    }
    public void run(){
        int count=1;
        while(true){
            data.set(count);
            System.out.println("Producer "+count);
            count++;
            try{
            Thread.sleep(1999);
        }catch(Exception e){}}
    }
}

class Consumer extends Thread{
    MyData1 data;
    public Consumer(MyData1 d){
        data=d;
    }

    public void run(){
        int value;
        while(true){
            value=data.get();
            System.out.println("Consumer "+value);
        }
    }
}
public class InterprocessCommThread {
    public static void main(String[] args) {
        MyData1 data=new MyData1();
        Producer p=new Producer(data);
        Consumer c=new Consumer(data);

        p.start();
        c.start();

    }
}
