package OOPConcepts;

public class MethodOverloading2 {
    public static void main(String[] args){
        AccountUtil myAccountUtil =new AccountUtil();

        int obtain1 = myAccountUtil.add(6, 7);
        System.out.println(obtain1);

        int obtain2 = myAccountUtil.add( 8, 9);
        System.out.println(obtain2);

        double obtain3 = myAccountUtil.add(4 , 8);
        System.out.println(obtain3);

        String obtain4 = myAccountUtil.concat( "Good", "Success");
        System.out.println(obtain4);

        String obtain5 = myAccountUtil.concat("Great", 100);
        System.out.println(obtain5);

    }
}




class AccountUtil{
    int add(int e, int f){
        return  e+f;
    }
    double add(double e, double f){
        return e+f;
    }
    int add(int e, int f, int g){
        return e+f+g;
    }
    String concat(String e, String f){
        return e+f;
    }
    String concat(String e, int f){
        return e + f;
    }
}
