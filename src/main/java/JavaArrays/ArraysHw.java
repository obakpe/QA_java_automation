package JavaArrays;

import java.util.Scanner;

public class ArraysHw {
    public static void main(String[] args) {

        int[] a = {10,20,30,40,50};
        int length = a.length;
        int sum =0;
        for (int i = 0; i<a.length; i++){
            sum +=a[i];
        }
        int average = sum/ length;

        System.out.println("Array average:" + average);
        System.out.println("min:" +a[0]+"max:" +a[a.length-1]);

    }
}