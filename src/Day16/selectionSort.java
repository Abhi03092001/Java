package Day16;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11}; // unsorted list
        System.out.println("Unsorted array" + Arrays.toString(arr));

        // Selection sort logic
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the current element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Print the sorted array
        System.out.println("Sorted list using Selection Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
