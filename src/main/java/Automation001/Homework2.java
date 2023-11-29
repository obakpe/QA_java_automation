package Automation001;
/*

public class Homework2 {
    public static String stringTimes(String str, int n) {
        String result = "";

        for (int i = 0; i < n; i++) {
            result += str;
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "abc";
        int n = 3;
        String result = stringTimes(input, n);
        System.out.println("Result: " + result);
    }
    public static boolean doubleX(String str) {
        int indexOfFirstX = str.indexOf('x');

        if (indexOfFirstX != -1 && indexOfFirstX < str.length() - 1) {
            return str.charAt(indexOfFirstX + 1) == 'x';
        }

        return false;
    }

    public static void main(String[] args) {
        String input = "axxbb";
        boolean result = doubleX(input);
        System.out.println("Result: " + result);
    }


    public static String front22(String str) {
        int length = str.length();
        if (length < 2) {
            return str + str + str;
        } else {
            String firstTwoChars = str.substring(0, 2);
            return firstTwoChars + str + firstTwoChars;
        }
    }

    public static void main(String[] args) {
        String input = "kitten";
        String result = front22(input);
        System.out.println("Result: " + result);
    /*
public static void
    //Given two temperatures, return true if one is less than 0 and the other is greater than 100.
    public static void temperature(0, 100) {
        int tempA = 0;
        int tempB = 100;
    }
    if(tempA< 0&&tempB >100)

    {
        return true;
        System.out.println()
    }
//Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
       public static void b10(int a, int b){
    if(a + b ==10 || a==10);
        }
        public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(b10(scanner.nextln);
        }




public class Homework2 {
    public static void main(String[] args) {
        String originalStr = "Hello";
        String reversedStr = "";
        System.out.println("originalStr:" + originalStr);
        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
            System.out.println("reversedStr:" + reversedStr);
        }
    }

}
When squirrels get together for a party, they like to have cigars. A squirrel party is successful when
 the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no
 upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.


    public static boolean cigarParty(int cigars, boolean isWeekend){

    if(isWeekend) {
        return cigars >= 40;
    }else{
        return cigars>=40 && cigars<= 60;
}
    }

}
        */