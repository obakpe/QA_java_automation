package exceptionHandle;

import java.io.FileNotFoundException;

//Exception Handling in Java
/*
the exception handling in Java is to handle the runtime errors so that the normal
flow of the application can be maintained.

Exception could be any abnormal condition in your code.

Exception comes from class Throwable in Java.
                                 Throwable
          exception                                   error
          IOException                                 StackOverFlowError
          SQLException                                VirtualMachineError
          ClassNotFoundException                      OutOfMemoryError
          RuntimeException
          ArithmeticException
          NullPointerException
          IndexOutOfBoundException
          ArrayIndexOutOfBound
          StringIndexOutOfBound

  Keywords
  -try
  -catch
  -finally
  -throw
  -throws
 */
public class exceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("code still runs");
        }
        System.out.println("++++++++++++++++++++++");
        try {
            int[] arr = new int[5];
            int value = arr[10];
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
        }finally {
            System.out.println("My code is still running");
        }
       /* int[] arr = new int[9];
        int value = arr[3];
        System.out.println("Will it run");
        */
        try {
            readFile("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("caught FileNotFoundException: " + e.getMessage());
        }
    }

    public static void readFile(String filename) throws FileNotFoundException {
        if (!filename.equals("example.txt")) {
            throw new FileNotFoundException("File not found:+filename");
        }
    }
}


