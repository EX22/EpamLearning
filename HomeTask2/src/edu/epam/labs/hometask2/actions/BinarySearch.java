package edu.epam.labs.hometask2.actions;

import java.util.Arrays;

/**
 * Binary search of particular element in sorted array.
 */
public class BinarySearch {

    /**
     * Sorts gotten array and implements binary search of particular element.
     * @param arr array of doubles.
     * @param x the element which is needed to be find.
     * @return index of demanded element in array.
     */
    public int find(double[] arr, double x) {
        Arrays.sort(arr);
        int index = -1;
        int low = 0;
        int high = arr.length;
        int middle;

        while (low < high) {
            middle = (low + high) / 2;
            if (x == arr[middle]) {
                index = middle;
                break;
            } else {
                if (x <= arr[middle]) {
                    high = middle;
                } else {
                    low = middle + 1;
                }
            }
        }
        return index;
    }
}
