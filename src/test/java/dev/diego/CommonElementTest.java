package dev.diego;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

public class CommonElementTest {

    @Test
    public void testFindCommonElements() {
        CommonElement commonElement = new CommonElement();

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 4, 5, 2));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 3, 4, 6));

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 3, 4));
        ArrayList<Integer> actual = commonElement.findCommonElements(list1, list2);

        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    public void testNoCommonElements() {
        CommonElement commonElement = new CommonElement();

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        ArrayList<Integer> expected = new ArrayList<>();
        ArrayList<Integer> actual = commonElement.findCommonElements(list1, list2);

        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyLists() {
        CommonElement commonElement = new CommonElement();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        ArrayList<Integer> expected = new ArrayList<>();
        ArrayList<Integer> actual = commonElement.findCommonElements(list1, list2);

        assertEquals(expected, actual);
    }

    @Test
    public void testOneEmptyList() {
        CommonElement commonElement = new CommonElement();

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>();

        ArrayList<Integer> expected = new ArrayList<>();
        ArrayList<Integer> actual = commonElement.findCommonElements(list1, list2);

        assertEquals(expected, actual);
    }

    @Test
    public void testAllElementsCommon() {
        CommonElement commonElement = new CommonElement();

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> actual = commonElement.findCommonElements(list1, list2);

        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
}
