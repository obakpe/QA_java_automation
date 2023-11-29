package WrapperClass;
// Java Wrapper Class
/* Java Wrapper class provides the mechanism to convert premitive into object and reverse.
Java is OOP so we need to deal with objects many times like Collections, Serialization, Sychronization etc.

Change the value in method
Serialization
Synchronization
Util's
Collection Framework
 */

public class WrapperClass {
    public static  void  main(String[] args){
        int primitiveInt = 42;
        Integer wrapperInt = Integer.valueOf(primitiveInt);

        double premitiveDouble = 3.14;
        Double wrapperdouble = Double.valueOf(premitiveDouble);
         Integer autoboxedInt = primitiveInt;

         int unboxedInt = autoboxedInt;

         System.out.println("primitive Int:" + primitiveInt);
         System.out.println("Wrapped Int: " + wrapperInt);
         System.out.println("primitive Double:" + wrapperdouble);
         System.out.println("Autoboxed Int:" + autoboxedInt);
         System.out.println("unboxed Int: " + unboxedInt);


    }
}
