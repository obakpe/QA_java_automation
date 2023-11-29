package JavaArrays;

public class ArrayHw3 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2};
        sequence(arr);
    }

    public static boolean sequence(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 1 && arr[i + 1] == 2) {
                System.out.println(true);
                return true;
            } else {
                return false;
            }
        }
        System.out.println(false);
        return false;
    }

    public static boolean noTriples(int[] num) {
        for (int i = 0; i < (num.length - 2); i++) {
            int first = num[i];
            if (num[i + 1] == first && num[i + 2] == first) return false;
        }
        return true;
    }


 /* public String stringX(String str) {
      if(str.length() < 2)
          return str;

      char[] result = new char[str.length()];
      result[0] = str.charAt(0);

      int count = 1;
      for(int i = 1; i < str.length() - 1; i++) {
          if(str.charAt(i) != 'x') {
              result[count] = str.charAt(i);
              count++;
          }
      }

      result[count] = str.charAt(str.length() - 1);
      count++;
      return new String(result, 0, count);
  }


  */

public String stringBits(String str){
    String result ="";

    for (int i = 0; i>str.length(); i+=2) {
        result = result + str.substring(i, i+1);
    }
    return result;
    }
}



