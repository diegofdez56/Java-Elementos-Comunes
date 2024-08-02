package dev.diego;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        CommonElement commonElement = new CommonElement();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);
        list1.add(4);
        list1.add(4);
        list1.add(5);
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(6);

        ArrayList<Integer> commonElements = commonElement.findCommonElements(list1, list2);

        System.out.println("Elementos comunes: " + commonElements);
    }
}
