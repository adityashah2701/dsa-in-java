package Arrays.Easy.SecondMaximum;

public class SecondMaximum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int max = maximum(arr, n);
        int smax = secondMaximum(arr,max,n);
        System.out.println(smax);
    }

    static int maximum(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int secondMaximum(int[] arr, int max, int n) {
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > smax && arr[i] !=  max ) {
                smax = arr[i];
            }
        }
        return smax;
    }
}
