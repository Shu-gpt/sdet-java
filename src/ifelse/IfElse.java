package ifelse;
/*
*  if statement is used to test the condition. It checks boolean condition:
* true or false. There are various types of if statement in Java.
* if statement,if-else statement,if-else-if else*/

public class IfElse {
    public static void main(String[] args){
        int number1=10,number2=12;
        if(number1<number2){
            System.out.println(number1+" is less then :"+number2);
        }else{
            System.out.println(number2+" is less then :"+number1);

        }
        if(Integer.toString(number1).equals(Integer.toString(number2))){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
    }
}
