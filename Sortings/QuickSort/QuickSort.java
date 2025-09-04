package Sortings.QuickSort;

public class QuickSort {

    public static void print(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void quick_sort(int arr[]){
        
    }
    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int n = arr.length;
        print(arr);
        quick_sort(arr);
        print(arr);

    }
}
