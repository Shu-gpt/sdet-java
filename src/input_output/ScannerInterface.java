package input_output;

import java.util.Scanner;

public class ScannerInterface {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int num=sc.nextInt();
        long num1=sc.nextLong();
        boolean bool=sc.nextBoolean();
        System.out.println(str+ " "+ num+" "+num1+" "+bool);

    }
}
