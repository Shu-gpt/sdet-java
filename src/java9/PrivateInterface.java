package java9;
//we can create private methods inside an interface. Interface allows us to declare
// private methods that help to share common code between non-abstract methods
////before java 9
//creating private methods inside an interface cause a compile time error.
// The following example is compiled using Java 8 compiler and throws a compile time error

interface Sayable {
    default void say(){
        saySomthing();
    }
    private void saySomthing(){
        System.out.println("hi aks");
    }
}
public class PrivateInterface implements Sayable{
    public static void main(String[] args){
        Sayable s=new PrivateInterface();
        s.say();
        byte age=120;
        short _age=128;
        
    }
}
