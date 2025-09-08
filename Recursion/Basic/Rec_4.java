package Recursion.Basic;

public class Rec_4 {
    static void reverse_array(int arr[] ,int left , int right){
        if(left >= right) {
            for(int num : arr){
                System.out.print(num + " ");
            }
            return;
        }

        swap(arr,left,right);
        reverse_array(arr,left + 1,right - 1);
    }
    static void swap(int arr[] , int left , int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverse_array(arr,0,arr.length - 1);
    }
}
