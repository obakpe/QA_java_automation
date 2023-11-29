package JavaCollectionFramework;


import java.util.ArrayList;
import java.util.LinkedList;

public class MergeListChallenge {
    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println();

        for (Integer element : arrayList) {
            System.out.println(element);
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(50);
        linkedList.add(60);
        linkedList.add(70);
        for (Integer element : linkedList) {
            System.out.println(element);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++");
linkedList.remove(1);
        for(Integer element : linkedList){
            System.out.println(element);
        }
      // public static void main(LinkedList<Integer> merge(ArrayList<Integer> arrayList,  LinkedList<Integer> linkedList);
    }
}


