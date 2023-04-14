package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int array[] = {5, 2, 6, 7, 11, 16, 21};

        selectionSort(array);

        for(int i : array){
            System.out.println(i);
        }
    }

    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]){
                    min =j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}