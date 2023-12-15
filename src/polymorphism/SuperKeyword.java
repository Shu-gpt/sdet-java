package polymorphism;
class Person{
    String name;
    Long mobile;
    String gender;
    Person(String name,String gender,Long mobile){
        this.name=name;
        this.mobile=mobile;
        this.gender=gender;
    }
}
class Employees extends Person{
    double salary;

    Employees(String name,Long mobile,String gender,double salary){
        super(name,gender,mobile);
        this.salary=salary;
    }
    public void display(){
        System.out.println("name is:"+name+" "+"my gender is :" +gender+" my salary is:"+salary);
    }

}

public class SuperKeyword {
    public static void main(String[] args){
        Employees e=new Employees("shu",1234567890l,"male",100.19);
        e.display();
    }



}
