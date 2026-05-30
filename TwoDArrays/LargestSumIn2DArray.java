package TwoDArrays;

public class LargestSumIn2DArray {
    public static void main(String[] args) {
        int arr[][] = { { 100, 200, 300 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int largestSum = largestSum(arr);
        System.out.println(largestSum);
    }

    static int largestSum(int arr[][]) {
        int sum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int innersum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                innersum += arr[i][j];
            }
            if (innersum > sum) {
                sum = innersum;
            }
        }

        return sum;
    }
}
