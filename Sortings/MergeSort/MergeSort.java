package Sortings.MergeSort;

public class MergeSort {
    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void merge_sort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int mid = (low + high) / 2;
        merge_sort(arr, low, mid);
        merge_sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            lArr[i] = arr[i + low];
        }
        for (int i = 0; i < n2; i++) {
            rArr[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                arr[k++] = lArr[i++];
            } else {
                arr[k++] = rArr[j++];
            }
        }
        while (i < n1) {
            arr[k++] = lArr[i++];
        }
        while (j < n2) {
            arr[k++] = lArr[j++];
        }

    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int n = arr.length;
        print(arr);
        merge_sort(arr, 0, n - 1);
        print(arr);
    }
}
