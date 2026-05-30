package Arrays.Easy.MultiplyOddAndAddEven;

public class MultiplyOddAndAddEven {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += 10;
            } else {
                arr[i] *= 2;
            }
        }
        print(arr);

    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
