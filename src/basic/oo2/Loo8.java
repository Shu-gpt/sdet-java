package basic.oo2;

public class Loo8 {
    public static void main(String[] args){
        final float pi=3.1415f;
        //final key use for constant variable that variable not be modifie
        //pi=3.14167;
        final int A=12;
        final String str="ABB";
        final double d=999.99;
        System.out.println(A+str+d);
        char a='a';
        //a="$"; it is not work due to char variable doesn't accept string variable
        //a='$'; it will work
        // all smileys have its own ascii value like :heart: <3
        //it also has unicode value
        char c='\u1F60';
        System.out.println(c);
        char c1='\u0022';
        System.out.println(c1);

    }
}
