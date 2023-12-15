package polymorphism;
/*
* If a class has multiple methods having same name but different in parameters,
* it is known as Method Overloading.
*If we have to perform only one operation, having same name of the methods
* increases the readability of the program.*/

public class MethodOverLoading {
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }

    public static void main(String[] args){
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2));
        System.out.println(sum(1.05f,2.34f));

    }
}
