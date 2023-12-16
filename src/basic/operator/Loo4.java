package basic.operator;

public class Loo4 {
    public static void main(String[] args){
        //type casting
        byte a=10;
        //explicit casting
        //widening process where number is convert into big to small container
        int b=a;//ot (int)a both are same it has done ny jvm
        int a_=300;
        //byte b_=a_; in valid type casting because byte length is fixed, so it will overflow
        //a_=100101100 b_=101100
        // narrowing is the process to higher type to lower type it will not be allowed by jvm, so you need to use datatype in before it
        byte b_=(byte) a_;
        System.out.println(b_);
        String s="12";
        System.out.println(Integer.toString(a));
        System.out.println(Integer.parseInt(s));
        System.out.println(s.toCharArray());
        float course=100;
        int gst=18;
        //int total=course+gst*course;
        float total=course+gst*course;
    }
}
