package JavaArrays;
import java.util.Arrays;

public class StringArrays {
    public static void main (String[] args) {

        String[] words = {"Hello", " ", "World", "!"};
        System.out.println(Arrays.toString(words));
        String sentence = String.join("", words);
        System.out.println(sentence);


        String[] countries = {"USA","Canada", "UK", "Australia", "India"};
        String target = "Australia";
        boolean found = false;

        for (String country : countries) {
            if (country.equals(target)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(target + "is in the given array");
        } else {
            System.out.println(target + "is not in the given array");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        String [] cities = {"NewYork","Los Angeles","Chicago","Huston","Miami"};
        Arrays.sort(cities);

        System.out.println("Sorted Array: ");
        for (String city: cities) {
            System.out.println(city);
        }

        String Mydata = "hello, class, this, is, java, lesson";
        String [] userData = Mydata.split( ",");
        for (String data : userData){
            System.out.println(data);

        }
        }
}

