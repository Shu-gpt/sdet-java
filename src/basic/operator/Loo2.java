package basic.operator;

public class Loo2 {
    public static void main(String[] args){
        // Relational operators <,>,==,<=,>=,!=
        int age_abs=12;
        int age_bas=13;
        System.out.println(age_bas<age_abs);
        System.out.println(age_bas>age_abs);
        System.out.println(age_bas==age_abs);
        System.out.println(age_bas<=age_abs);
        System.out.println(age_bas>=age_abs);
        System.out.println(age_bas!=age_abs);
        //for character is comparing char to its ascii value
        System.out.println('A'==65);
        byte a=65;
        System.out.println(a=='A');//java property
        System.out.println(65.0=='A');

    }
}
