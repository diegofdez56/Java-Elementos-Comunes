package dev.diego;

import java.util.ArrayList;
import java.util.HashSet;

public class CommonElement {
    public ArrayList<Integer> findCommonElements(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<>(list1);
        HashSet<Integer> set2 = new HashSet<>(list2);
        set1.retainAll(set2); // Retiene solo los elementos comunes entre set1 y set2
        return new ArrayList<>(set1);
    }
}
