package basic.oo2;


public class Loo12 {
    public static void nullPointerException(String s){
        try{
            int len=s.length();
            System.out.println(len);
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }
    public static void arithmeticException(int number1, int number2){
        try{
            int number=number1/number2;
            System.out.println(number);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
    public static void numberFormatException(String str){
        try{
            int number=Integer.parseInt(str);
            System.out.println(number);
        }catch (NumberFormatException e){
            System.out.println(e);
        }
    }
    public static void arrayIndexOutOfBoundException(){
        try{
            int[] arr=new int[2];
            arr[2]=12;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        numberFormatException("abc");
        arithmeticException(12,0);
        nullPointerException(null);
        arrayIndexOutOfBoundException();

    }
}
