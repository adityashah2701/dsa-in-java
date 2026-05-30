package TwoDArrays;

public class MinimumOfMaximum2DArray {
    public static void main(String[] args) {
        int arr[][] = { { 19, 23, 45 }, { 43, 54, 67 }, { 78, 81, 95 } };
        int minimumOfMaximum = findMinimumFromMaximum(arr);
        System.out.println(minimumOfMaximum);
    }

    static int findMinimumFromMaximum(int[][] arr) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int largest = Integer.MIN_VALUE;

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }
            }
            if(minimum > largest){
                minimum = largest;
            }
        }

        return minimum;
    }
}
