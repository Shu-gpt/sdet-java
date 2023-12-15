package basic.oo2;

class Loo13{
    public static void main(String[] args){
        try{
            int[] a=new int[5];
            a[5]=30/0;
        }
        catch(Exception e){System.out.println("common task completed");}
        //catch(ArithmeticException e){System.out.println("task1 is completed");}
        //catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}
        finally {
            System.out.println("catch all error");
        }
        System.out.println("rest of the code...");
    }
}