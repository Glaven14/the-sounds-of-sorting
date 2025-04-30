package edu.grinnell.csc207.soundsofsorting;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

import edu.grinnell.csc207.soundsofsorting.sortevents.SortEvent;
import edu.grinnell.csc207.soundsofsorting.sorts.Sorts;

public class SortsTests {
    /**
     * @param <T> the carrier type of the array
     * @param arr the array to check
     * @return true iff <code>arr</code> is sorted.
     */
    public static <T extends Comparable<? super T>> boolean sorted(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static <T extends Comparable<? super T>> boolean listed(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static Integer[] makeTestArray() {
        return new Integer[] {
            3, 7, 9, 1, 2,
            18, 16, 15, 19, 8,
            14, 12, 5, 13, 4,
            6, 0, 17, 11, 10
        };
    }

    public static Integer[] makeSmallArray() {
        return new Integer[] {
            3, 7, 11, 10
        };
    }

    public void testSort(Consumer<Integer[]> func) {
        Integer[] arr = makeTestArray();
        func.accept(arr);
        assertTrue(sorted(arr));
    }

    @Test
    public void testBubbleSort() {
        //testSort(Sorts::bubbleSort);
        
        List<SortEvent<Integer>> l = new ArrayList<SortEvent<Integer>>();
        Integer[] arr = makeSmallArray();
        Integer[] arr2 = makeSmallArray();

        l = Sorts.bubbleSort(arr);
        Sorts.eventSort(arr2, l);
        
        assertTrue(sorted(arr));
        assertTrue(sorted(arr2));
    }
    
    @Test
    public void testInsertionSort() {
        //testSort(Sorts::insertionSort);
        
        List<SortEvent<Integer>> l = new ArrayList<SortEvent<Integer>>();
        Integer[] arr = makeSmallArray();
        Integer[] arr2 = makeSmallArray();

        l = Sorts.insertionSort(arr);
        Sorts.eventSort(arr2, l);
        
        assertTrue(sorted(arr));
        assertTrue(sorted(arr2));
    }
    
    @Test
    public void testSelectionSort() {
        //testSort(Sorts::selectionSort);
        
        List<SortEvent<Integer>> l = new ArrayList<SortEvent<Integer>>();
        Integer[] arr = makeSmallArray();
        Integer[] arr2 = makeSmallArray();

        l = Sorts.selectionSort(arr);
        Sorts.eventSort(arr2, l);
        
        assertTrue(sorted(arr));
        assertTrue(sorted(arr2));
    }

    @Test
    public void testMergeSort() {
        //testSort(Sorts::mergeSort);
        
        List<SortEvent<Integer>> l = new ArrayList<SortEvent<Integer>>();
        Integer[] arr = makeSmallArray();
        Integer[] arr2 = makeSmallArray();

        l = Sorts.mergeSort(arr);
        Sorts.eventSort(arr2, l);
        
        assertTrue(sorted(arr));
        assertTrue(sorted(arr2));
    }
    
    @Test
    public void testQuickSort() {
        //testSort(Sorts::quickSort);
        
        List<SortEvent<Integer>> l = new ArrayList<SortEvent<Integer>>();
        Integer[] arr = makeSmallArray();
        Integer[] arr2 = makeSmallArray();

        l = Sorts.quickSort(arr);
        Sorts.eventSort(arr2, l);

        assertTrue(sorted(arr));
        assertTrue(sorted(arr2));
    }

    @Test
    public void testMySort() {
        //testSort(Sorts::mySort);
        
        List<SortEvent<Integer>> l = new ArrayList<SortEvent<Integer>>();
        Integer[] arr = makeSmallArray();
        Integer[] arr2 = makeSmallArray();

        l = Sorts.mySort(arr);
        Sorts.eventSort(arr2, l);
        
        assertTrue(sorted(arr));
        assertTrue(sorted(arr2));
    }

}