package polymorphism;
/*The covariant return type specifies that the return type may vary in the same
*direction as the subclass*/
class A{
    A get(){
        return this;
    }
}
class B extends A{
    @Override
    B get(){
        return this;
    }

}

public class CovariantReturnType {
    public static void main(String[] args){

    }
}
