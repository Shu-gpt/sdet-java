package polymorphism;
/*
* If subclass (child class) has the same method as declared in the parent class,
* it is known as method overriding in Java.
*In other words, If a subclass provides the specific implementation of the method
*  that has been declared by one of its parent class, it is known as method overriding*/
class Vehicle{
    void run(){
        System.out.println("vehicle is running");
    }
}
class Bike extends Vehicle{
    void run(){
        System.out.println("bike is running");
    }

}
class Bank{
    double getInterest(){
        return 0;
    }
}
class Axis extends Bank{
    double getInterest(){
        return 8.5;
    }

}
class Hdfc extends Bank{
    double getInterest() {
        return 7.7;
    }
}
class KotakMahindra extends Bank{
    double getInterest() {
        return 7.5;
    }

}

public class MethodOverRiding {
    public static void main(String[] args){
        Hdfc hdfc=new Hdfc();
        Axis axis=new Axis();
        KotakMahindra kotakMahindra=new KotakMahindra();
        System.out.println(hdfc.getInterest());
        System.out.println(axis.getInterest());
        System.out.println(kotakMahindra.getInterest());

    }
}
