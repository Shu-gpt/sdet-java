package variables;
/*
* instant variable is a type of variable where that variable declared under in
*  class it is accesable throwout the class
*
*
* */
public class InstantVariable {
    String name;
    int age;
    InstantVariable(String name,int age){
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args){
        InstantVariable ins=new InstantVariable("shu",12);
    }
}
