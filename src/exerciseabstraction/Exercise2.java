package exerciseabstraction;

abstract class bank{
    abstract void getBalance();
}
class bankA extends bank{
    void getBalance(){
        System.out.println("Balance Bank A: 100");
    }
}
class bankB extends bank{
    void getBalance(){
        System.out.println("Balance Bank B: 150");
    }
}
class bankC extends bank{
    void getBalance(){
        System.out.println("Balance Bank C: 200");
    }
}
public class Exercise2 {
    public static void main(String []args){
    bankA a = new bankA();
    bankB b = new bankB();
    bankC c = new bankC();
    
    a.getBalance();
    b.getBalance();
    c.getBalance();
}
}