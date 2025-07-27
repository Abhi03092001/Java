package Day16;

public class MergeSort {

    // === Top‑level driver ===
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};   // unsorted list

        System.out.print("Unsorted: ");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Sorted  : ");
        printArray(arr);
    }

    // === Merge Sort (divide‑and‑conquer) ===
    private static void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;  // avoid overflow
            mergeSort(a, left,        mid);       // sort first half
            mergeSort(a, mid + 1,     right);     // sort second half
            merge(a, left, mid, right);           // merge the two halves
        }
    }

    // === Merge two sorted subarrays a[left..mid] and a[mid+1..right] ===
    private static void merge(int[] a, int left, int mid, int right) {
        int n1 = mid - left + 1;          // sizes of temp arrays
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // copy data to temp arrays
        System.arraycopy(a, left,     L, 0, n1);
        System.arraycopy(a, mid + 1,  R, 0, n2);

        int i = 0, j = 0, k = left;     // merge back to a[]
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) a[k++] = L[i++];
            else              a[k++] = R[j++];
        }

        // copy any remaining elements
        while (i < n1) a[k++] = L[i++];
        while (j < n2) a[k++] = R[j++];
    }

    // === Utility: print array ===
    private static void printArray(int[] a) {
        for (int num : a) System.out.print(num + " ");
        System.out.println();
    }
}

