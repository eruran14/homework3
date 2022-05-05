package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] arr = {2.4, -3.2, 7.9, 4.6, -7.3, 5.2, 6.7, 5.8, 2.3, 9.6, 9.3, 3.9, -4.5, 1.8, 4.1};
        double sum = 0;
        int negative = 0;
        int positiveNumbers = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                negative = i;
                break;
            }
        }
        for (int i = negative; i < arr.length; i++) {
            if (arr[i] > 0){
                sum += arr[i];
                positiveNumbers++;
            }
        }

        double average = sum / positiveNumbers;
        System.out.println(average);

        //ДЗ на сообразительность

        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            double currentMin = arr[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(currentMin > arr[j]){
                    currentMin = arr[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i){
                arr[currentMinIndex] = arr[i];
                arr[i] = currentMin;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}









