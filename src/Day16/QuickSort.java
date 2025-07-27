package Day16;

import java.util.Arrays;

public class QuickSort {
        public static void main(String[] args) {
            int[] arr = {29, 10, 14, 37, 13};
            System.out.println("Unsorted list" + " " + Arrays.toString(arr));// Unsorted list

            quickSort(arr, 0, arr.length - 1);

            System.out.println("Sorted list using Quick Sort:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

        // Quick Sort function
        static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                int pi = partition(arr, low, high);  // Get pivot index
                quickSort(arr, low, pi - 1);         // Sort left side
                quickSort(arr, pi + 1, high);        // Sort right side
            }
        }

        // Partition function
        static int partition(int[] arr, int low, int high) {
            int pivot = arr[high];   // Choose last element as pivot
            int i = low - 1;         // Index of smaller element

            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            // Swap pivot to its correct position
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1; // Return pivot index
        }
}


