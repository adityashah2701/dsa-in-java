package Arrays.Easy.RotateLeftByKPlaces.Practice;

public class Rotate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int n = arr.length;
        int k = 3;
        rotate(arr, n, k);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void rotate(int[] arr, int n, int k) {
        k = k % n;

        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    static void reverseArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
