package edu.epam.labs.hometask2.search;

import java.util.Arrays;

// Бинарный поиск элемента в отортированном массиве

public class BinarySearch {

    public int findElement(double[] arr, double x) {
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
