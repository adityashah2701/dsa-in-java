package Arrays.Easy.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int target = 4;

        int num = linearSearch(arr, n, target);
        if (n > 0)
            System.out.println("Found: " + num);
        else
            System.out.println("Not Found");

    }

    static int linearSearch(int[] arr, int n, int target) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return arr[i];
            }
        }
        return -1;
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
