package basic.operator;

public class Loo6 {
    public static void main(String[] args){
        int a=10;
        a+=12;
        //post increment print than increase
        System.out.println(a++);
        //pre increment first increase than print
        System.out.println(++a);
        // pre decrement
        System.out.println(--a);
        //post decrement
        System.out.println(a--);
        //23+23+24
        System.out.println(++a +a++ + a++);
        //24+23+23+22
        System.out.println(--a + --a + a--+a--);
    }
}
