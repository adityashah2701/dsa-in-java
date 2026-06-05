package Arrays.Easy.RotateLeftByKPlaces.Practice;

public class RotatePractice {

    static void rotate(int arr[], int n, int k) {
        k %= n;
        int temp[] = new int[k];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            temp[j] = arr[i];
            j++;
        }

        for (int i = n - k - 1; i >= 0; i--) {
            arr[i+k] = arr[i];
        }

        for(int i = 0; i < temp.length ; i++){
            arr[i] = temp[i];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int n = arr.length;
        int k = 3;
        rotate(arr, n, k);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
