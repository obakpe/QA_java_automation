package unitTesting;

import org.testng.Assert;
import org.testng.annotations.*;

public class Assignments {
    public static void main(String[] args) {
        int[] num = {};
    }

    public static boolean fl(int[] num) {
        if (num.length >= 1) {
            int[] result = {num[0], num[num.length - 1]};
            System.out.println(result);

        }
        return true;
    }

    public static int ab2(int[] num) {
        if (num.length <= 2)
            return (num[0] + num[1]);
        if (num.length == 1)
            return num[0];
        return 0;
    }

    public static int maxTwice(int[] nums) {
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
   /* public static int[] original(int[] num){
        int x =num[0];
        num[0] = num[num.length-1];
        num[]
    }

    */

    public static class annotationsInTestNG {

        @Test
        public static  void testThis(){
            System.out.println("this is @test annotation");
        }
        @BeforeSuite
        public static void beforeSuite() {
            System.out.println("this is before class");
            //initialize the webdriver and perform global setup
        }
        @BeforeClass
        public static void beforeClass(){
            //perform class level setup eg: opening a specific page
            System.out.println("this is before class");
        }
        @BeforeMethod
        public static void beforeMethod(){
            //perform actions before each testmethod. eg: login
            System.out.println("this is before method");
        }
        @BeforeTest
        public static void beforeTest(){
            //perform actions before each test
            System.out.println("this is before Test");
        }
        @Test
        public static void test(){
            //test features could be 1 or many @ test depending on the feature
            System.out.println("this is test");
        }
        @AfterTest
        public static void afterTest(){
            //perform action after each test eg: clear cookies and history
            System.out.println("this is after test");
        }
    @AfterMethod
        public static void afterMethod() {
            // after each method eg: logout
        System.out.println("this is after method");
    }
    @AfterClass
        public static void afterClass(){
            //eg: navigate back to home page close windows or tabs
            System.out.println("this is after class");
    }
    @AfterSuite
            public static void afterSuite(){
            // global clean up eg: closing browser or quit driver control for two browser
            System.out.println("this is after suite");
    }
    @Test
    @Parameters({"a","b"})
        public void testME(int c, int d){
            int sum = c+d;
            System.out.println(sum);
    }
        @Test
        @Parameters({"a","b"})
        public void testME1(int c, int d){
            int sub = c-d;
            System.out.println(sub);
        }
        @Test
        @Parameters({"a","b"})
        public void testME2(int c, int d){
            int div = c/d;
            System.out.println(div);
        }
        @Test
        @Parameters({"a","b"})
        public void testME3(int c, int d){
            int mul = c*d;
            System.out.println(mul);
        }
        @DataProvider(name = "myData")
        public Object [][] myData(){
            return new Object[][]{
                    {3,5,6},
                    {2,5,7},
                    {5,5,10}
            };
        }
        @Test(groups = {"mytest"}, dataProvider = "myDate")
        public void datagivenTest(int a, int b,int expectedResult){
            calculator c = new calculator();
            int result = c.add(a,b);
            Assert.assertEquals(result,expectedResult);

        }

        class calculator{
            public int add(int a, int b){
                return a+b;
            }
        }

    }
}



