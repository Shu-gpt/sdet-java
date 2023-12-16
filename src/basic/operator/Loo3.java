package basic.operator;

public class Loo3 {
    public static void main(String[] args){
        //Logical operator like(!,&&,||)
        boolean a=true;
        System.out.println(a);
        System.out.println(!a);
        boolean b=false;
        System.out.println(a&&b);
        System.out.println(a&&!b);
        System.out.println(a||b);
        int num1=10;
        int num2=12;
        boolean ans=!(num1>num2 ||num2>5);
        System.out.println(ans);


    }
}
