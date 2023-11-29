package Automation001;

import javax.swing.border.Border;
import java.util.Random;
import java.util.Scanner;

public class ControlFlowStatements {
    public static void main(String[] args) {

        int a = 100;
        float b = 100.20f;
        if (a > b) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        if (a + b < 150) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        // given an int check if the int is less than equal to 10;
        //int x = 9;
        int x = 9;
        if (x < 10) { //if (x < 10 || x== 10) //if(x < 11 && x == 10) {
            System.out.println("yes");
        } else if (x == 10) {
            System.out.println("x is equal to 10");
        } else {
            System.out.println("no");
        }
        //switch statements
        int month = 5;
        switch (month) {
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("mar");
                break;
            case 4:
                System.out.println("apr");
                break;
            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("june");
                break;
            default:
                System.out.println("enter a valid month");
                break;
        }
        // print first 10 numbers:
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // print from 100 to 50:
        for (int i = 100; i >= 50; i--) {
            System.out.println(i);
        }
        //print even numbers from 1 to 10;
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
/*
// nested for loop
        for (int i = 1; i <=3;i++){
    for (int j= 1; j<=3;j++){
        System.out.println(i + "" + j);
    }
        }
        String message ="Hello world";
        for (int i = 0; i <message.length();i++){
            char character = message.charAt(i);
            System.out.println("character at index " + i + ":" + character);
        }
        // while loop
        int i = 0;
        while (i<5){
            System.out.println(i);
            i++;
        }
        do {
            System.out.println();
            i++;
        }while (i <= 10);

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("enter a positive number:");
            number = scanner.nextInt();
        }while (number <=0);
        System.out.println("you have entered a positive number:" + number);

        */

      /*  Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("Option 1");
            System.out.println("Option 2");
            System.out.println("Option 3");
            System.out.println("quit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("you have selected option 1");
                    break;
                case 2:
                    System.out.println("you have selected option 2");
                    break;
                case 3:
                    System.out.println("you have selected option 3");
                    break;
                case 4:
                    System.out.println("quit");
                    break;
                default:
                    System.out.println("Invalid Choice, Please try again");
            }
        }while (choice != 4);

       */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt( 10)+1;
        int guess;
        int attempts = 0;

        do {
            System.out.println("guess the number (1-10):");
            guess = scanner.nextInt();
            attempts++;

            if (guess != targetNumber) {
                System.out.println("Try again..");
            }
        } while (guess != targetNumber);
        System.out.println("great you have guessed the number in :" + attempts);


        String str = "hello James";
        for (char character : str.toCharArray()) {
            System.out.println(character);
        }
    }
}







        /*
   *java complies from top to bottom.the statement in the code are executed according to the Border
    *in which they appear. Java has statements that can be used t control the flow of the code.
    * such statements are called control flow statements. this is a fundamental feature in java which
    * provides easy flow of the code.
    *
    * there are three types of statements.
    * 1> decision making--statements
    * 2>loop statements
    * 3>jump statements
    *
    * 1>Decision-making>--if statements
    *                  --switch statements
    * 2>loop statements>--do while loop
    *                   --while loop
*/





