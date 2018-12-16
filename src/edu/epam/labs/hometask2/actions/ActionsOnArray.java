package edu.epam.labs.hometask2.actions;

/* Действия над массивом.
* Обмен местами элементов массива если длинна элемента в двоичном представлении
* больше длинны следующего элемента в двоичном представлении,
* иначе возведение в квадрат текущего элемента.
*/

public class ActionsOnArray {

    public void swapOrSquare(double [] arr){
        double tempElem;
        for (int i = 0; i < arr.length - 1; i++){
            if (getBinaryLength(arr[i]) > getBinaryLength(arr[i+1])){
                tempElem = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = tempElem;
            } else {
                arr[i] = arr[i]*arr[i];
            }
        }
    }

    private int getBinaryLength(double d){
        int a = (int)d;
        int b;
        int length = 0;
        StringBuilder sb = new StringBuilder();
        while(a !=0){
            b = a%2;
            sb.append(b);
            a = a/2;
            length++;
        }
        return length;
    }

}
