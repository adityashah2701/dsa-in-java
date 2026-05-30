package Arrays.Easy.ThreeSum;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

    List<List<Integer>> ans = new ArrayList<>();
    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 7, 98, 78, 75, 45, 69, 90, 43, 23, 34, 56 };
        int n = arr.length;
        int target = 100;
        threeSum(arr, n, target);
    }

    static void threeSum(int[] arr, int n, int target) {
        java.util.Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] == target) {
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1])
                        j++;
                    while (j < k && arr[k] == arr[k + 1])
                        k--;
                } else if (arr[i] + arr[j] + arr[k] < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
    }
}
