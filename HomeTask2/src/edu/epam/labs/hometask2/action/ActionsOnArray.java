package edu.epam.labs.hometask2.action;

/**
 * Actions on array such as swapping elements or getting to square.
 */
public class ActionsOnArray {

    /**
     * Having gotten array of doubles swap element with the next one if the next one's element's length in binary
     * system longer and square if not.
     * @param arr array of doubles.
     */
    public void swapOrSquare(double[] arr) {
        double tempElem;
        for (int i = 0; i < arr.length - 1; i++) {
            if (getBinaryLength(arr[i]) > getBinaryLength(arr[i + 1])) {
                tempElem = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tempElem;
            } else {
                arr[i] = arr[i] * arr[i];
            }
        }
    }

    /**
     * Convert decimal to binary and find the length of particular number in binary system.
     * @param d double digit. Should contain already rounded number.
     * @return integer number equals the length of decimal d in binary system.
     */
    public int getBinaryLength(double d) {
        int a = (int) d;
        int b;
        int length = 0;
        StringBuilder sb = new StringBuilder();
        while (a != 0) {
            b = a % 2;
            sb.append(b);
            a = a / 2;
            length++;
        }
        return length;
    }

    /**
     * Round array's elements.
     * @param arr array of doubles.
     */
    public void round(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.round(arr[i]);
        }
    }

}
