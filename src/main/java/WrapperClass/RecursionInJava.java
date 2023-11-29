/* package WrapperClass;
import static WrapperClass.RecursionExample.a;

// Java recursions

 In Java is a process in which a method calls itself continuously.
A method in Java that calls itself is called recursive method.



public class RecursionInJava {
    public static void main(String[] args){
       RecursionExample.a();
       System.out.println("factorial of 5 is:"+ RecursionExample.factorial(5));

       int count =15;
        int[] fibonacciSeries = generateFibo(count);

       System.out.print("fibonacci series:");
       for (int num : fibonacciSeries){
           System.out.println(" " + num);
       }

        System.out.println("=========================");
       getFibo(count -2);
}
}
class RecursionExample {
    static int count = 0;

    static void a() {
        count++;
        if (count <= 10) {
            System.out.println("hello class" + count);
            a();
        }
    }

// Find the factorial number for 5

    static int factorial(int n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }
    // print Fibonacci series
    static int n1 = 0,n2 = 1;
    static int[] generateFibo(int count) {
int[] series = new int[count];
series[0] =n1;
if (count > 1){
    series[1]  = n2;
    generateFibo(series, 2, count);
}
return series;
}
static  void generateFibo(int[] series, int current, int count){
    if(current < count) {
        int n3 = n1 + n2;
        series[current] = n3;
        n1 = n2;
        n2 = n3;
        generateFibo(series, current + 1, count);
    }
    }
    static int N1=0,N2=1,N3=0;
    static void getFibo(int count){
        if(count > 0){
            N3 = N1 + N2;
            N1 = N2;
            N2 = N3;
            System.out.println(" " + N3);
            getFibo(count-1);
        }
    }

}

*/

