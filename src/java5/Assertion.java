package java5;

public class Assertion {
    public static void main(String[] args){
        int age=100;
        try{
            assert age<12;
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }
}
