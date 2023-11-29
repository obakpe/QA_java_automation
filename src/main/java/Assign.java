/*
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
 */

public class Assign {
    public static void main(String[] args) {
        int[] num = {};
    }

    public static boolean fl(int[] num) {
        if (num.length >= 1) {
            int[] result = {num[0], num[num.length - 1]};
            System.out.println(result);
            return true;
        }
        return false;
    }

    public static int bc2(int[] num) {
        if (num.length <= 2)
            return (num[0] + num[1]);
        if (num.length == 1)
            return num[0];
        return 0;
    }

    public static int maxTriple(int[] nums) {
        int max = nums[0];
        if (max <= nums[nums.length - 1]) ;
        if (max <= nums[nums.length / 2]) ;
        return max;
    }

    public static boolean twice(int[] num) {

        if (num.length == 2) {
            if (num[0] == 2 && num[1] == 2)
                return true;
            if (num[0] == 3 && num[1] == 3) ;
        }
        return false;
    }

    public static int[] swap(int[] num) {
        int a = num[0];
        num[0] = num[num.length - 1];
        num[num.length - 1] = a;
        return num;
    }


    }





