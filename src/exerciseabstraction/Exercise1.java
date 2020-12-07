package exerciseabstraction;

abstract class Parents{
    abstract void Message();
    void printMethod(){
        System.out.println("Message");
    }
}
class sub1 extends Parents{
   void Message(){
       System.out.println("This is first subclass");
   }
    
}
class sub2 extends Parents{
   void Message(){
       System.out.println("This is second subclass");
   }
    
}
public class Exercise1 {
    public static void main(String []args){
        sub1 a=new sub1();
        sub2 b=new sub2();
        a.Message();
        b.Message();
    }
}
