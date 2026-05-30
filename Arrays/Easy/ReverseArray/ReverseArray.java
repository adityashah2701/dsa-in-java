package Arrays.Easy.ReverseArray;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        print(arr);
        reverseArray(arr, 0, n - 1);
        print(arr);
    }

    static void reverseArray(int[] arr, int start, int end) {

        for (int i = start; i < arr.length; i++) {
            if (start == end)
                break;
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
