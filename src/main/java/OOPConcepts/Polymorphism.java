package OOPConcepts;
/*Polymorphism is one of the fundamental concept op OOP
it allows objects of diff classes to be  treated as objects of common super class
Polymorphism enables you to write more flexible and reusable code by abstracting away
the specific implementation details of objects and focusing on their common behaviour

in polymorphism 2 mechanism
-Method Overloading
-Method Overriding

1. Method Overloading
occurs when a subclass provides specific implementation for a method
 that is already defined in its super class.

 the override method in the subclass should have some signature.
 the @verride annonation is often used to indicate that a method is intended to override
 a super class method.

 When we call a method on an object, java will execute the appropriate implementation
 of the method based on the actual type of the object at runtime

 Interface
 In Java interface define a contract for class to implement. Multiple classes can implement the same interface and each
 class provides its own implementation for the methods declared in the interface.
 we can use polymorphism by creating objects of classes that implements the same interface and
 treating  them instances of interface.
 this allows us to work with objects in a generic way without worrying about this specific implementation

 */
public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("------Creating animal class instance with Dog object's makeSound");

    Animal myAnimal = new Dog();
    myAnimal.makeSound();
System.out.println("------Creating instance of Animal class for maeSound method.");
    Animal animal = new Animal();
    myAnimal.makeSound();
}

}
class Animal{
    void makeSound(){
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal {
    @Override
    void makeSound(){
        System.out.println("woof!");
    }
}