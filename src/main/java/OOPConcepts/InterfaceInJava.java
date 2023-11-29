package OOPConcepts;
//Java interface
/*
interface in java is a  blueprint of a class.
it has static constants and abstract methods
the interface in java is a method to achieve abstraction. there can only abstract methods in
the java interface, not method body. It is used to achieve abstraction and multiple inheritance in java.

In other words, you can say that interfaces can have abstract methods and variables.
It cannot have a method body.
It is used to achieve abstraction
By interface we can support the functionality of multiple inheritance.
it can be used to achieve loose coupling.
 */

public class InterfaceInJava {
    public static void main(String[] args) {
        Bird sparrow = new Bird("sparrow");

        sparrow.fly();
        sparrow.swim();
    }
}
interface Flyable{
    void fly();
}
interface Swimable{
    void swim();
}

class Bird implements Flyable,Swimable{
    private String name;

    public Bird(String name){
        this.name = name;
    }

    @Override
    public void fly(){
        System.out.println(name + " is flying");
    }

    @Override
    public void swim(){
        System.out.println(name + " is swimming");
    }
}