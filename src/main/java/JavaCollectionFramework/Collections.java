package JavaCollectionFramework;
import java.util.*;


 /*Java collections Framework
Java collection Framework provides an architecture to store and manipulate the group of objects

Java collections can achieve all the operations that you perform on data such as searching,
sorting,insertion,manipulation,and deletion.
What is a collection in Java
A collection represents a single unit of objects
this framework provides a ready-made architecture for sorting and manipulation of a group of objects.

iterable interface
collection interface

list interface
Arraylist class
--implements list interface
it uses dynamic array to store the elements of the collection
it can also store the elements in the order they are added to the collection
it can store different types of elements in the collection
it can be randomly accessed- order us non synchronized



LinkedList class
the LinkedList class is a subclass of ArrayList class.
the LinkedList class implements the list interface
the LinkedList class maintains the insertion order of the elements
the LinkedList class maintains the first-in-first-out (FIFO) order of the elements
the LinkedList class is a doubly linked list implementation of the list
it stores the elements as nodes linked to the previous element
it is not thread safe NOT synchronized
faster than ArrayList for manipulation of a group of objects



Vector class
 // vector in Java
            //Vector uses a dynamic array to store the data elements
            //It is similar to arraylist but its synchronized and contains many more methods that are not
            //part of collection framework
stack class
-LIFO
-extends the functionality of vector - meaning it inherits all the methods that vector has.


Queue interface
priorityQueue class
Deque interface
ArrayDeque class

Set interface
HashSet class
LinkedHashset class
SortedSet interface
 TreeSet


  */

public class Collections {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("dog");
        System.out.println(animals.get(1));
        animals.remove(3);

        if (animals.contains("Cat")) {
            System.out.println("yes it does");
        }

        for (String animal : animals) {
            System.out.println(animal);
        }
        String[] str = {"Apple", "Banana", "Orange", "Melon"};
        List<String> fixedSizeList = Arrays.asList(str);


        ArrayList<String> arrayList = new ArrayList<>(fixedSizeList);
        arrayList.add("kiwi");
        for (String ar : arrayList) {
            System.out.println(ar);

            arrayList.add("Strawberry");
            arrayList.remove(3);
            System.out.println(arrayList);

        }
        ArrayList<Object> exampleList = new ArrayList<>();
        exampleList.add(1);
        exampleList.add("Hello");
        exampleList.add(true);
        exampleList.add(12.33);

        System.out.println("ArrayList elements:");
        for (Object element : exampleList) {
            System.out.println(element);
        }

        System.out.println("++++++++++++++++++++++++++");
        exampleList.set(1, "World");
        for (Object element : exampleList) {
            System.out.println(element);
        }
        exampleList.get(3);

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Melon");
        linkedList.add("Melon");

        System.out.println("LinkedList Elements:");
        for (String element : linkedList) {
            System.out.println(element);
        }
        linkedList.removeFirst();
        linkedList.addFirst("Strawberry");
        linkedList.removeLast();

        System.out.println("After Manipulation of LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);


            Vector<Integer> numbers = new Vector<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            numbers.add(6);
            numbers.add(7);
            numbers.add(8);
            numbers.add(9);
            numbers.add(10);
            numbers.add(11);
            numbers.add(12);

            System.out.println(numbers.get(2));

            System.out.println("Printing all the elements in the Vector:");
            for (int number : numbers) {
                System.out.println(number);
            }
            System.out.println("size: " + numbers.size());
            System.out.println("is it empty? " + numbers.isEmpty());
            System.out.println("how big?" + numbers.capacity());

            System.out.println("after trim:");
            numbers.trimToSize();
            System.out.println("how big? " + numbers.capacity());

            numbers.setSize(10);
            System.out.println("new big? " + numbers.capacity());
            System.out.println(numbers.get(29));
            System.out.println(numbers.get(11));

            System.out.println("******************************");

            Stack<String> stackOfCards = new Stack<>();

            //Pushing new items to the Stack
            stackOfCards.push("Jack");
            stackOfCards.push("Queen");
            stackOfCards.push("King");
            stackOfCards.push("Ace");

            //Displaying the stack
            System.out.println("Stack -> " + stackOfCards);

            //Popping items from the Stack
            String cardAtTop = stackOfCards.pop(); // Throws EmptyStackException if the stack is Empty
            System.out.println("Stack.pop() -> " + cardAtTop);
            System.out.println("Current Stack -> " + stackOfCards);

            //Get the item at the top of the stack without removing it
            cardAtTop = stackOfCards.peek(); // Throws EmptyStackException if the stack is empty
            System.out.println("Stack.peek() -> " + cardAtTop);
            System.out.println("Current Stack -> " + stackOfCards);

            //Check if the stack is empty
            boolean isStackEmpty = stackOfCards.isEmpty();
            System.out.println("Is the stack empty? " + isStackEmpty);

            //Find the position of an object in the stack
            int position = stackOfCards.search("Queen"); // Returns 1-based position, or -1 if not found
            System.out.println("Position of 'Queen': " + position);

            //Size of the Stack
            int size = stackOfCards.size();
            System.out.println("Size of stack: " + size);


            System.out.println("************************************");
            //set interface in java
            // set has hashset, which is a collection of unique elements
            Set<String> set = new HashSet<>();
            set.add("Apple");
            set.add("Banana");
            set.add("Orange");
            set.add("melon");
            set.add("melon");

            System.out.println(set.contains("Apple"));
            System.out.println(set.contains("melon"));
            System.out.println(set.size());
            System.out.println(set.isEmpty());

            System.out.println("*********************************************");
            //linkedHashSet class
            //linkedHashSet is a collection of unique elements
        /*
        Ordering:LinkedHashset maintains a doubly-linked list running
        through its entries, which means it orders its elements based on the insertion order.
        This means when you iterate over a LinkedHashSet, the elements will be returned i the order in which they were inserted
        Performance: LinkedHashSet has slightly lower performance than HashSet (though still constant time:
        0(1)) for certain operations due to the added complexity of maintaining the linked list.
        Implementation: it is a HashSet with a linked list running through it, as it is backed by a hash table
        (a HashMap instance) and linked list.
        Use - case: LinkedHashSet is a good choice when you need a Set that iterates predictably is insertion
        order and still provides quick search capabilities.
         */
            Set<String> set2 = new LinkedHashSet<>();
            set2.add("Apple");
            set2.add("Banana");
            set2.add("Orange");
            set2.add("melon");
            set2.add("melon");

            System.out.println(set2.contains("Apple"));
        }
    }
}

/*
* HashMap
Purpose: A HashMap is a map-based collection that is used to store key-value pairs.
* It allows you to map unique keys to values.
Ordering: HashMap does not guarantee any order of the entries.
* The order can change with the addition of new key-value pairs.
Performance: Operations such as get and put are typically O(1),
* provided the hash function distributes the elements properly among the buckets.
Implementation: It uses a hash table to store the map.
*  Each key-value pair is stored in a Map.Entry object.
Null Keys/Values: HashMap allows for one null key and multiple null values.
Use-case: You should use HashMap when you need to associate a unique key with
* a specific value and you want quick retrieval.
    *
    *
    *Purpose: A HashSet is a set-based collection used to store unique elements.
    * It is essentially an implementation of a mathematical set: a collection of distinct objects.
Ordering: Like HashMap, HashSet also does not guarantee any specific order of the elements.
* The order can appear random and may change over time, especially when new elements are added or removed.
Performance: Operations like add, remove, and contains have constant time complexity, O(1),
*  assuming the hash function distributes the elements evenly among the buckets.
Implementation: Internally, HashSet uses a HashMap to store its elements. Each element of
* the HashSet is stored as a key in the internal HashMap instance, while the value is a constant
* dummy object since values are not directly used by the HashSet.
Null Elements: HashSet allows null elements (though it can only have one null element since it
* cannot contain duplicate values).
Use-case: You should use HashSet when you need to ensure that there are no duplicates and
* you're not concerned about the order of elements.
 */




