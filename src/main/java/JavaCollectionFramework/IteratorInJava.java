package JavaCollectionFramework;

import  java.util.*;

/*
In Java iterator is used to iterate through the elements of a collection
it is an interface by the java collection
it allows you to traverse through the elements of a collection regardless
of the type of the collection is implimented
it provides methods to iterate through the elements of a collection
primary methods:
hasNext()
next()
remove()
 */
public class IteratorInJava {
    public static void main(String[] args){
       List<String> fruit = new ArrayList<String>();
       fruit.add("Apples");
       fruit.add("Banana");
       fruit.add("Orange");
       fruit.add("melon");

       Iterator<String> fruits = fruit.iterator();

       while (fruits.hasNext()) {
           String element = fruits.next();
           System.out.println(element);
       }
       // In the above code an ArrayList is created and the iterator is used to
        // iterate through the elements of the ArrayList
        //The next() method is used to get the next elements of the ArrayList
        //the hasNext() method is used to check if there are more elements in the Arraylist
        //The remove() method is used to remove the element from the Array




    }
}

