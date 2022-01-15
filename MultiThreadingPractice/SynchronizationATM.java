package MultiThreadingPractice;

class ATM {
        synchronized public void CheckBalance(String name) {
            System.out.println(name +" Checking Balance ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Balance");
        }
        synchronized public void withDraw(String name,int amount){
            System.out.println(name + ", Withdrawing");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(amount);
        }

}


class Customer extends Thread {
    ATM atm;
    String name;
    int amount;

    public Customer(String name,ATM a,int amount) {
        this.name = name;
        this.amount = amount;
        atm=a;
    }

    public void run() {
            atm.CheckBalance(name);
            atm.withDraw(name, amount);
    }
}

public class SynchronizationATM{
    public static void main(String[] args) {
        ATM atm= new ATM();
        Customer c1=new Customer("Suraj",atm, 1000);
        Customer c2=new Customer("Komal",atm, 1000);
        Customer c3=new Customer("Gautam",atm, 1000);

        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        Thread t3=new Thread(c3);

        t1.start();
        t2.start();
        t3.start();

    }
}