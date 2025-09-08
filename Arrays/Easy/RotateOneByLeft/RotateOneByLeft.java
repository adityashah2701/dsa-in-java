package Arrays.Easy.RotateOneByLeft;

public class RotateOneByLeft {
    static void rotateLeftByOne(int arr[], int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {31,2,3,4,5,5,6,6,7,67,78,76,5,45};
        int n = arr.length;
       for(int num : arr){
            System.out.print(num + " ");
        }
        rotateLeftByOne(arr,n);
        System.out.println();
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
