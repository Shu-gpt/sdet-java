package method;
/*
 * A method is a block of code or collection of statements or a set of code grouped
 * together to perform a certain task or operation. It is used to achieve the reusability
 * of code. We write a method once and use it many times. We do not require to write code
 * again and again. It also provides the easy modification and readability of code, just by
 * adding or removing a chunk of code. The method is executed only when we call or invoke it.
 */
/*
* type of method
* Predefined Method like avg(),max(),compareTo(),equal()
 *
* */


public class Method {
    public static void predefineExample(){
        int number1=12,number2=19;
        System.out.println(Math.max(number1,number2));
        System.out.println(Math.sqrt(number2));
        System.out.println(Math.abs(-100));
    }
    public static int sum(int[] arr){
        int curr_sum=0;
        for(int num:arr){
            curr_sum+=num;
        }
        return curr_sum;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println(sum(arr));
        predefineExample();
    }
}
