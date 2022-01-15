package MultiThreadingPractice;

class WhiteBoard{
    String text;
    int no_student=0;
    int count=0;

    public WhiteBoard(int count, int no_student){
        this.count=count;
        this.no_student=no_student;
    }

    synchronized public void write(String msg){
        System.out.println("Teacher is Writing "+msg);
        while(count!=0){
            //*calling wait(); method for once will wait only for few miliseconds
            //* we want the wait operation till count==0.

            //* Teacher will write only when the count is zero.
            try{wait();} catch(Exception e){}
        }

        text=msg; //* when count is =0 then it will take the msg.
        count=no_student; //* count is set to no. of Students.
        notifyAll();
    }

    synchronized public String read(){
        // when count ==0 then it's teacher turns we have to wait till the count
        // changes it value.
        while(count==0)
                try{wait();} catch(Exception e){ }

        // count is not equal to zero, we can take the text to read.
        String t=text;
        count--;
        if(count==0){
            // when count becames 0 it will notify the teacher to write.
            notify();
        }
        return t;
    }

    public void attendance(){
        no_student++;
    }
}

class Teacher extends Thread{
    WhiteBoard teach;

    String notes[]={"Java is language", "It is OOps", "It is platform Independent", "It supports Thread", "end"};
    public Teacher(WhiteBoard b){
        teach=b;
    }

    int index=notes.length;
    public void run() {
        for(int i=0; i<notes.length; i++){
            teach.write(notes[i]);
        }
    }

}

class Student extends Thread {
    String name;
    WhiteBoard b;

    public Student(WhiteBoard b, String name) {
        this.b = b;
        b.no_student++;
        this.name = name;
    }

    public void run() {
        String str;

        do{
            str = b.read();
            System.out.println(name + " is reading :  " +str);
            System.out.flush();
            // Here we need to use System.out.flush() in multithreading, Because println() method doesn't work well with
            // multithreading, using flush() will do better when compared with just using println() method.
        }while (!str.equals("end"));

    }
}


public class InterProcessCommThreadChallenge {

    public static void main(String []args){

        WhiteBoard b=new WhiteBoard(0,0);
        Teacher t=new Teacher(b);
        Student s1=new Student(b, "Student1");
        Student s2=new Student(b, "Student2");
        Student s3=new Student(b, "Student3");
        Student s4=new Student(b,"Student4");
        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
