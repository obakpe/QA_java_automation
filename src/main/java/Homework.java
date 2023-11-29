
public class Homework {
    public static void main(String[] args) {
        in100(105);
        near10(8,13);
        multi35(33);
    }

    //Given an int n, return true if it is within 10 of 100 or 200. Note:
    // Math.abs(num) computes the absolute value of a number.
    public static boolean in100(int n){
        if (n >= 90 && n <= 110 || n >= 190 && n <= 210){
            System.out.println("true");
            return true;
        }else {
            System.out.println("false");
            return false;
        }
    }

    // Given 2 int values, return whichever value is nearest to the value 10,
    // or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

    public static void near10(int a, int b){
        int diffa = Math.abs(10-a);
        int diffb = Math.abs(10-b);

        if (diffa < diffb){
            System.out.println(a);
        } else if (diffb < diffa) {
            System.out.println(b);
        }else {
            System.out.println(0);
        }
    }

    // Return true if the given non-negative number is a
    // multiple of 3 or a multiple of 5. Use the % "mod" operator
    public static boolean multi35(int num){
        if ((num % 3 == 0) || (num % 5 == 0) ){
            System.out.println(true);
            return true;
        }else {
            System.out.println(false);
            return false;
        }
    }

    //Given 2 positive int values, return the larger value that is in the range 10..20
    // inclusive, or return 0 if neither is in that range.
    public static void largeInRange(int a , int b){
        if (a >= 10 && a <= 20) {
            if (b >= 10 && b <= 20) {
                System.out.println(Math.max(a, b));
            } else {
                System.out.println(a);
            }
        } else if (b >= 10 && b <= 20) {
            System.out.println(b);
        } else {
            System.out.println(0);
        }
    }


    //Given 2 int values, return true if either of them is in the range 10..20 inclusive.
    public static void inRange(int a, int b) {

        System.out.println((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

}