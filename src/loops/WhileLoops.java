package loops;
/*
* The Java while loop is used to iterate a part of the program repeatedly until the specified
*  Boolean condition is true. As soon as the Boolean condition becomes false, the loop
* automatically stops.
*The while loop is considered as a repeating if statement. If the number of iteration
*  is not fixed, it is recommended to use the while loop.*/

public class WhileLoops {
    public static void main(String[] args){
        int num=0;
        //condition statement where we are checking num is less
        // than 10 that loop work otherwise it will break
        while (num<10){
            System.out.println(num);
            num++;//increase statement
        }
    }
}
