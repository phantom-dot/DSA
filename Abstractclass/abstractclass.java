package Abstractclass;


abstract class base{
    public base()
    {
        System.out.println("base class constructor");
    }
    public void hello()
    {
        System.out.println("helloji");
    }
    abstract public void greet();
    abstract public void greet2();
    //if we declare an abstract function then we must make that class abstract.
    //abstract class helps to define a standard for other classes
}

class child1 extends base {
//if we extend an abstract a class then we must make the child class abstract or should define all the abstract functions of the base class
//the abstract method of abstract class

    @Override
    public void greet() {
        System.out.println("hello ji");
    }

    @Override
    public void greet2() {
        System.out.println("greet2");
    }
}
class child2 extends base {
    //if we extend an abstract a class then we must make the child class abstract or should define
//the abstract method of abstract class
    @Override
    public void greet() {
        System.out.println("su prbhaat");
    }

    @Override
    public void greet2() {

    }
}



public class abstractclass {
    public static void main(String[] args) {
            child1 c1=new child1();
            c1.greet();
    }


}
