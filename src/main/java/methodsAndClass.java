public class methodsAndClass {
    public static void main(String[] args) {
        myMethod1();

        myMethod2(2, 5);
        myMethod3(2, 5);
        myMethod4();
        sleep(true, false);


    }

    public static void myMethod1() {
        System.out.println("hello i am being run by your call");
    }

    static void myMethod2(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static int myMethod3(int a, int b) {
        int sum = a * b;
        System.out.println(sum);
        return sum;
    }

    public static void myMethod4() {
        System.out.println("the larger number of given is :" + Math.max(4, 6));
        System.out.println(Math.floor(12.99f));
        String str = "Hello";
        System.out.println(str.length());
    }

    public static void sleep(boolean weekend, boolean vacation) {
        if (!weekend || vacation) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        //given an int n, return the difference between n and 21,
        //except return double the absolute difference if n is over 21

        //public static void diff21(int n){
           // if (n <= 21) {
              //  System.out.println(21 - n);
           // } else {
             //   System.out.println((n - 21) * 2);
            }
        }























/*
methods in java
A method in java is a block of code which only runs when it is called.
we can pass data to a method called parameters/arguments
methods are also known as functions
why use methods?
-- code once use it multiple time.

types of method
return method
void method

return method returns a data when called
void method does not return anythimg.

method with parameters
method without params
 */