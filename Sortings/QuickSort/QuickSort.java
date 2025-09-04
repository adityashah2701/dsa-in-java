package Sortings.QuickSort;

public class QuickSort {

    public static void print(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void quick_sort(int arr[], int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quick_sort(arr, low, pIndex - 1);
            quick_sort(arr, pIndex + 1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low, j = high;
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j)
                swap(arr,i,j);

        }
        swap(arr,low,j);
        return j;
    }

    public static void swap(int arr[],int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        // int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int arr[] = { 42, 12, 89, 5, 99, 1, 65, 23, 7, 88,
                  34, 56, 78, 90, 11, 19, 73, 29, 50, 3,
                  15, 67, 44, 27, 81, 31, 22, 9, 60, 40,
                  17, 100, 13, 4, 2, 30, 75, 6, 18, 55,
                  70, 8, 41, 16, 25, 10, 32, 20, 14, 36 };
        int n = arr.length;
        print(arr);
        quick_sort(arr, 0, n - 1);
        print(arr);

    }
}
