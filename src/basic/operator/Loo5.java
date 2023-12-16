package basic.operator;

public class Loo5 {
    public static void main(String[] args){
        int a=12;
        int b=14;
        int max=a>b?a:b;
        //if a>b max will a otherwise max will be a
        System.out.println(max);
        int c=13;
        int max1=(a>b)?(a>c)?a:c:(b>c)?b:c;
        System.out.println(max1);
    }
}
