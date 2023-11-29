package exceptionHandle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class exceptionexample2 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[4]);
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The array is out of values: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("math error is here: " + e.getMessage());
        } finally {
            System.out.println("this is my code continued.");
        }
        System.out.println("+++++++++++++++++++++++++++++++++");

        try {
            int age = -5;
            if (age < 0) {
                throw new IllegalAccessException("age can not be in negative");
            }
        } catch (IllegalAccessException e) {
            System.out.println("invalid age: " + e.getMessage());
        }
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

            try {
                System.out.println("first try block is started!!");
                try {
                    int[] arr = {1, 2, 3};
                    System.out.println(arr[4]);
                } catch (ArrayIndexOutOfBoundsException innerException) {
                    System.out.println("inner catch block:" + innerException.getMessage());
                }
                int result = 10 / 0;
                System.out.println(result);
            } catch (ArithmeticException outerException) {
                System.out.println("outer catch block" + outerException.getMessage());
            }
            System.out.println("program after try catch blocks.");

            System.out.println("+++++++++++++++++++++++++++++++");

            try {
                FileInputStream fileInputStream = new FileInputStream("doesnotexist.txt");
                int data = fileInputStream.read();
                System.out.println(data);
                fileInputStream.close();
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("final block executed.");
            }
        }
    }






