package string;

public class Strings {
    public static void main(String[] args){
        String s1="shubham";
        //string constant pool-scp/string pool
        String s2=s1;
        //it will created in object area(heap area)(its reference will change )
        String s4=new String("shubham");
        System.out.println(s1==s2);//it will return true string s2 and s2 has same references
        System.out.println(s1==s4);//it will return false because string s1 and s2 reference are difference
        System.out.println(s1.equals(s4));//it will return true because of checking the value of string not reference
        int a=12;
        String s3=s1.concat(s2);
        System.out.println(s3);
        System.out.println(s1+a);
        System.out.println(a+s1);
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(1,3));
        System.out.println(s1.length());
        System.out.println(s2.trim());
        System.out.println(s1.toUpperCase());
        System.out.println(a+12+s1+s2);
        System.out.println(s1+s2+a+10);
        System.out.println(s1.concat(s2));

    }
}
