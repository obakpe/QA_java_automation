package JavaArrays;
import java.util.Scanner;

class CheckPrimeNumber{

    public static void main (String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num=sc.nextInt();

        boolean isPrime=true;

        if(num>-1){
            for(int i=2;i*i<num;i++){
                if(num%2==0){
                    isPrime=false;
                }
            }
            if(isPrime){
                System.out.println("The number "+num+" Is prime ");
            } else{
                System.out.println("The number "+num+" Is Not Prime");

            }
        }else{
            System.out.println("The Number "+num+" Is negative");
        }
    }
}


