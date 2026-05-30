package Sortings.InsertionSort;

public class InsertionSort {
    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int n = arr.length;

        print(arr);
        for (int i = 0; i < n; i++) {
            for(int k = i ; k > 0; k--){
                if(arr[k-1]> arr[k]){
                    int temp = arr[k - 1];
                    arr[k - 1] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        print(arr);
    }

}
