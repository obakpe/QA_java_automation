package Automation001;

public class IntroToJava {

    public static void main(String[] args) {

        System.out.println("Hello world");
        byte num1 = 100;
        short num2 = 5000;
        int num3 = 50000;
        long num4 = 150000000l;
        float num5 = 3.14f;
        double num6 = 22.4875d;
        boolean bool = true;
        char ch = 'a';
        String str = "this is string in java";

        System.out.println(num1);
        System.out.println((num2));
/*
byte -  -128 to 127
short- -32768 to 32767
int - 2147483648 to 2147483647
long - -9bill< to + 9bill>
float - is number with decimal till 7 places
double - fractional numbers till is decimal places
boolean - true or false
char - 'a' - 'z'
String - "this is a string
        Assignment Operators            Comparison Operators
        =                               ==
        +=                              !=
        -=                              >
        *=                              <
        %=                              >=
        &=                              <=
        !-
        ^=
        >>=
        <<=
        logical operators
        && -- and
        || --or
        ! --NOT
        */

int a = 10;
int b = 2;
int c = a + b ;

System.out.println("this is assign a new varibale to do the math:"+ c);
System.out.println("this is direct from the system out:" + (a+b));
System.out.println("this is concatination" + a + b);

System.out.println(a-b);
System.out.println(a/b);
System.out.println(a*b);
System.out.println(a%b);

int d = a++;
System.out.println(d);
int e =a--;
System.out.println(e);
int f=--a;
System.out.println(f);
int g = ++a;
System.out.println(g);

int x = 100;
System.out.println(x);
int y =5;
y += 3;
System.out.println(y);
y -=3;
System.out.println(y);
y *= 2;
System.out.println(y);
y/= 2;
System.out.println(y);
y &= 2;
System.out.println(y);
y|= 2;
System.out.println(y);
y= 2;
System.out.println(y);
y<<= 2;
System.out.println(y);
y>>= 2;
System.out.println(y);

int v =100;
int n =50;

System.out.println(y == n);
        System.out.println(y != n);
        System.out.println(y < n);
        System.out.println(y > n);
        System.out.println(y <= n);
        System.out.println(y >= n);
        String letters = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(letters.length());
        System.out.println("these are the English alphabets:" + letters);
        System.out.println(letters.indexOf("m"));

    }
}
