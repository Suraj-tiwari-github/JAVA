package ENUM_Demo;

enum Dept{
    CS ("John", "Block A"), IT("Smith", "Block B");
    //* CS is Having it's own object which is head and loc
    String head;
    String loc;
    private Dept(String head, String loc){
        this.head=head;
        this.loc=loc;
        System.out.println(this.name());
//        Enum constructor: When the class of Enum is loaded, the constructor will be called for each and every
//        constant and the constructor will be run for CS, IT, CIVIL, ECE and in constructor we have called the name()
//        Method, it will print all the name of the constants in the same order which they are declared.
//
//        We have just created an object, Enum constructor will not be called upon the creation of object but when the
//        class is loaded by the class loader.
    }

    public String headName(){
        return head;
    }

    public String getLocation(){
        return loc;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Dept d=Dept.CS;






//        System.out.println(d.name()); //* return name of the enum
//
//        switch(d){
//            case CS:
//                System.out.println("Head : Suraj Tiwari \nBlock : A");
//                break;
//            case IT:
//                System.out.println("Head: Smith \nBlock: B");
//                break;
//            case CIVIL:
//                System.out.println("Head: Srinivas \nBlock: C");break;
//            case ECE:
//                System.out.println("Head: Dave \nBlock: D");break;
//        }
    }
}
