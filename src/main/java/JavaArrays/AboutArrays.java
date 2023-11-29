package JavaArrays;
/* Java Arrays

In Java Arrays is a data structure that allows you to store multiple
values of the same data type in a single variable.
It is a container that can hold a fixed number of elements, and these elements can be
accessed using index.
Arrays are widely used in Java for organizing and manipulating collection of data.
Declaration and Initialization
int[] muArray ={1,2,3,4,5,6,77,0};

Array Size;
the size of an array is fixed when its created, and you can change it later,

Accessing Elements;
Array elements are accessed using 0 based index, first element being 0 index.
using a loop to access an array is most common.
Array length;
Length method is used to get the size of an array.
Array and Objects:
In java arrays are object, which means they have certain methods and properties like length.
however they are not instead of classes, they are specific to object.
Types of Arrays:
int,String, char, double etc.
single dimension array
multi-dimension array


*/
/*
import java.util.Arrays;

public class AboutArrays {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Element ar index 0: " + num[0]);
        System.out.println("Element ar index 1: " + num[1]);
        System.out.println("Element ar index9: " + num[9]);
        for (int i = 0; i <= num.length; i++) {
            System.out.println(i);
        }
        int[] num = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;


        for (int i = 0; i <= num.length; i++) {
            System.out.println(i);
        }
        int[] original = {1, 2, 3};
        int[] reversed = reverse(original);
        System.out.println(Arrays.toString(reversed));

        System.out.println("--------------------------");

        int[] array1 = {1, 2, 3, 5};
        int[] array2 = {1, 3, 4, 5, 1, 3};
        boolean result1 = unlucky1(array1);
        boolean result2 = unlucky1(array2);

        System.out.println(result1);
        System.out.println(result2);

        System.out.println(Arrays.toString(makeEnds()));

    }

    //Given an array of ints, return true if 6 appears as either
    //the first or last element in the array. The array will be length 1 or more.
    public static boolean firstlast(int[] num) {
        return num.length >= 1 && (num[0] == 6 || num[num.length - 1] == 6);
    }
    // Given an array of ints length 3, return a new array with the elements in reverse order.
    // so {1,2,3} becomes {3,2,1}.

    public static int[] reverse(int[] num) {
        int[] result = new int[3];
        result[0] = num[2];
        result[1] = num[1];
        result[2] = num[0];
        return result;
    }

    //Given an int array length 2, return true if it does not contain a 2 or 3.
    public static boolean and23(int[] num) {
        return num[0] != 2 && num[0] != 3 && num[1] != 2 && num[1] != 3;
    }

//Given an int array 3, if there is a 2, in the array immedistely follow by a 3,
// set the 3 elements to 0. return the changed array.

    public int[] fix23(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == 2 && num[i + 1] == 3) {
                num[i + 1] = 0;
            }
        }
        return num;
    }

    //we"ll say that a 1 immediately followed by a 3 in an "unlucky" 1.
    //Return true if the given array contains an unlucky 1 in the first 2 or last 2 position in the array.
    public static boolean unlucky1(int[] num) {
        int len = num.length;

        if (len >= 2 && (num[0] == 1) && (num[1] == 3)) {
            return true;
        }
        if (len >= 3 && (num[len - 2] == 1 && num[len - 1] == 3)) {
            return true;
        }
        return false;
    }

    //given an array of int length 3 return the sum of all the elements

    public int sum3(int[] num) {
        if (num.length == 3) {
            return num[0] + num[1] + num[2];
        } else {
            throw new IllegalArgumentException("Array length must be 3");
        }
    }
    //Given an array of int return a new array length 2 containing the first
    //and last elements from the original array. the original array will be length 1 or more.


    public static int[] makeEnds() {
        int[] num = {1, 2, 3, 4};
        if (num.length >= 1) {
            int[] result = {num[0], num[num.length - 1]};
            System.out.println(result);
            return result;
        } else {
            throw new illegalArgumentException("Array length must be 1 or more");
        }
    }
}




 */



