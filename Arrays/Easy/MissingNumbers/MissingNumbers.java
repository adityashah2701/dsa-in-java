package Arrays.Easy.MissingNumbers;

public class MissingNumbers {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        int n = arr.length;
        int missingValue = missingNum(arr, n);
        System.out.println(missingValue);
    }

    static int missingNum(int[] arr, int size) {
        // code here

        long sum = (size + 1) * (size + 2) / 2;
        long arrSum = 0;
        for (int ele : arr) {
            arrSum += ele;
        }

        return (int) (sum - arrSum);

    }
}
