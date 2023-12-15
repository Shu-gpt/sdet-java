package loops;
/*
* The Java for loop is used to iterate a part of the program several times.
* If the number of iteration is fixed, it is recommended to use for loop.
 */

public class ForLoops {
    public static void main(String[] args){
        int[] numbers={321,12,14};
        for(int index=0;index<numbers.length;index++){
            System.out.println(numbers[index]);
        }
        for(int num:numbers){
            System.out.println(num);
        }
    }
}
