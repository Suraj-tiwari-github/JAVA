package practiceSection;

import java.util.Objects;

class Whiteboard{
 int count=0; int no_students=0;
 String text;

 public Whiteboard(int no_students, int count){
     this.count=count;
     this.no_students=no_students;
    }

   synchronized public void write(String str) {
       System.out.println("Teacher is Writing: " + text);
       while(count!=0)
           try{wait(); }catch(Exception e){ }

       text = str;
           count=no_students;
           notifyAll();

   }

   synchronized public String read(){
     while(count==0){
         try{wait(); } catch(Exception e){ }
     }

     String t=text;
     count--;
     if(count==0){
         notify();
     }
     return t;

   }
}

class Teacher extends Thread{
    Whiteboard white;
 String str[]={"Java is an Object oriented Programming", "It is secure", "It is Robust", "Supports Distributed Systems", "end"};

 public Teacher(Whiteboard b){
     white=b;
 }
 public void run(){
     for(int i=0; i<str.length; i++){
         white.write(str[i]);
     }
 }

}

class Students extends Thread {
    Whiteboard stud;
    String name;

    public Students(Whiteboard b, String name) {
        stud = b;
        this.name = name;
    }

    public void run() {
        String reading;
        do {
            reading = stud.read();
            System.out.println(name + " reads :" + reading);
            System.out.flush();
        } while (!reading.equals("end"));
    }
}
public class practice1 {
    public static void main(String[] args) {
        Whiteboard w=new Whiteboard(4,0);
        Teacher t=new Teacher(w);
        Students s1=new Students(w,"Suraj Tiwari");
        Students s2=new Students(w,"Gautam Tiwari");
        Students s3=new Students(w,"Sanajana Tiwari");
        Students s4=new Students(w,"Rishabh Tiwari");

        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}