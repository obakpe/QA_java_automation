package exceptionHandle;
/*
write a java program that perfprms the following tasks:
prompt the user to enter two intergers, numerator and denominator.
Attempt to divide numerator by denominator.
Implement exception handling to catch any exception that might occur during the division operation.
Display an appropriate error message if an exception is caught,indicating the
type of exception and a user-friendly message.
if no exception is caught, display the result of the division.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionsxample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* try {
            System.out.println("Enter Numerator");
            int numerator = scanner.nextInt();
            System.out.println("Enter denominator");
            int denominator = scanner.nextInt();
            int result = numerator / denominator;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("everything works:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("stop here");
        }
    }
}

           */
        try {
            System.out.println("Enter  words  count:");
            String input = scanner.nextLine();
            System.out.println();


        } catch (IllegalArgumentException e) {
            System.out.println("words 4today:"+ e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Magnificient" + e.getMessage());
        }finally {
            scanner.close();
            System.out.println();
        }

       /* public static String sentence () {

            for (int i = 0; i < sentence.length(); i++)
                if (sentence.isEmpty() &&  sentence.length()) {


        */


                }
            }




