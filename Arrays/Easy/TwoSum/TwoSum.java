package Arrays.Easy.TwoSum;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 7, 98, 78, 75, 45,10, 69, 90, 43, 23, 34, 56 };
        int n = arr.length;
        int target = 100;
        twoSum(arr, n, target);
    }

    static void twoSum(int arr[], int n, int target) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
             
                }
            }
        }
    }
}
