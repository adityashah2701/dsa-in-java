package Arrays.Easy.RotateLeftByKPlaces;

public class RotateLeftByKPlaces {
    static void rotate(int arr[],int n,int k){
         k = k % n;
        int temp[] = new int[k];
       
        for(int i = 0 ; i < k ; i++ ){
            temp[i] = arr[i];
        }
        for(int i = k;i<n;i++){
            arr[i-k] = arr[i];
        }
        for(int i = 0 ; i < k ; i++){
            arr[n - k + i] = temp[i];  
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,8,9,0};
        int n = arr.length;
        int k = 18;
        rotate(arr,n,k);
        for(int num :arr){
            System.out.print(num + " ");
        }
    }
}
