package GFG_InsertionSort;

import java.util.Scanner;

public class InsertionSort {

    public void insertionSort(int arr[]) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int curr = i;
            int prev = i - 1;
            int curValue = arr[curr];

            while (prev >= 0 && curValue < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curValue;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        InsertionSort obj = new InsertionSort();
        obj.insertionSort(arr);

        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
