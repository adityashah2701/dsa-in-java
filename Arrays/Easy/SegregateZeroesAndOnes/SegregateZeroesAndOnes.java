package Arrays.Easy.SegregateZeroesAndOnes;

public class SegregateZeroesAndOnes {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0 };
        int n = arr.length;
        segregate(arr, n);

        for(int ele:arr){
            System.out.print(ele + " ");
        }

    }

    static void segregate(int[] arr, int n) {
        int zeroes = 0;
        int ones = 0;

        for (int ele : arr) {
            if (ele == 0)
                zeroes += 1;
            else
                ones += 1;
        }

        for(int i = 0 ; i < zeroes ; i++){
            arr[i] = 0;
        }
        for(int i = zeroes ; i < n ; i++){
            arr[i] = 1;
        }
    }
}
