package Day16;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {45, 12, 78, 3, 22};
        System.out.println("Unsorted list " + Arrays.toString(arr));// Unsorted list

        // Bubble sort logic
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted list using Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
