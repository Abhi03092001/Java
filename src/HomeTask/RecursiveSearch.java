package HomeTask;

import java.util.Scanner;

public class RecursiveSearch {

    public static boolean search(int[] arr, int key, int index) {
        if (index >= arr.length) return false;
        if (arr[index] == key) return true;
        return search(arr, key, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = search(arr, key, 0);
        System.out.println(key + " found? " + found);

        sc.close();
    }
}

