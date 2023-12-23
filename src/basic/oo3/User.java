package basic.oo3;

import java.util.Scanner;

public class User {
    public static void disPlayUserInfo(String name,int age,long mobile,double salary){
        System.out.println(name+" "+age+" "+mobile+" "+salary);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        byte age=sc.nextByte();
        long mobile=sc.nextLong();
        double salary=sc.nextDouble();
        disPlayUserInfo(name,age,mobile,salary);

    }
}
