package Arrays.Easy.SecondLargest;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = { 9, 22, 34, 445, 32, 2, 332, 22, 33, 34, 78, 56, 45 };
        int n = arr.length;
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest :- " + secondLargest);
    }
}
