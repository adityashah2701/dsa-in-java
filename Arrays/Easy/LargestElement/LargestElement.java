package Arrays.Easy.LargestElement;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {9,22,34,445,32,2,332,22,33,34,78,56,45};
        int n = arr.length;
        int largest = arr[0];
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest :- " + largest);
    }
}
