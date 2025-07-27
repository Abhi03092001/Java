package Day16;

public class InsertionSort {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {10, 20 ,5 , 46, 80};
        System.out.print("before Sorting: ");
        for(int i = 0; i<n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        // Unsorted list

        // Insertion sort logic
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the key in its correct position
            arr[j + 1] = key;
        }

        // Print the sorted array
        System.out.println("Sorted list using Insertion Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
