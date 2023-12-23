package loops;
/*
* The Java for loop is used to iterate a part of the program several times.
* If the number of iteration is fixed, it is recommended to use for loop.
 */

public class ForLoops {
    public static void main(String[] args){
        //repetative task is doing with the help of loops
        //in for loop has three condition first is where you want to start
        // where you want to end and third condition is what you want to do your condition increase or decrease
        /*for(int start=0;start<10;start++){
            System.out.println("start");

        }
        int[] numbers={321,12,14};
        for(int index=0;index<numbers.length;index++){
            System.out.println(numbers[index]);
        }
        System.out.println(numbers);
        for(int num:numbers){
            System.out.println(num);
        }
        //exit code 0 means it says complete the program(successfull)
        // exit code 1 force to stop(user interupated)
        for(;;){
            System.out.println("abs");
            break;
        }
        boolean b=false;
        for(;b;){
            System.out.println("abb");
        }
        for(double a=1.1;a<10;a++){
            System.out.println(a);
        }
        for(int i=1;i<50;i+=2){
            System.out.println(i);
        }
        for(int i=0;i<50;i++){
            if(i%2==1){//or !(i%2==0)
                System.out.println(i);
            }
        }
        for(int i=1;i<50;i++){
            if(i%2==0){//or use !(i%2==1)
                continue;
            }
            System.out.println(i);
        }
        for(int i=1;i<=10;i++){
            System.out.println("5*"+i+" =: "+i*5);

        }
        for(int num=1;num<=20;num++){
            for(int i=1;i<=10;i++){
                System.out.print(num +"*"+i+" =: "+i*num+", ");
            }
            System.out.println();
        }
       int i=0;
        for(;i<10;i++){
            System.out.println(i);
        }
        System.out.println(i);
        Long fact=1l;
        for(long i1=1;fact<120;i1++){
            fact*=i1;
        }
        System.out.println(fact);*/
        int i=1;
        do{
            System.out.println(i);
        }while (++i<=10);
        while (--i>0){
            System.out.println(i);
        }
        int number=12;

    }
}
