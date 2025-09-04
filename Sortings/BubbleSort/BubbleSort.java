package Sortings.BubbleSort;

public class BubbleSort {
    public static void print(int[] arr, String console) {
        System.out.println();
        System.out.println(console);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 98, 48, 37, 416, 55, 34, 43, 28, 18, 80 };
        int n = arr.length;

        print(arr, "Array before Sorting is :- ");
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        print(arr, "Sorted Array is :");

    }
}
