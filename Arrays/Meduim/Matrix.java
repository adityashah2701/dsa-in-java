package Arrays.Meduim;

public class Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,0,0,1},{1,1,0,1},{1,1,1,1},{1,0,0,1},{1,1,1,1}};
        int n = arr.length;
        int m = arr[0].length;
        int[] cols = new int[m];
        int[] rows = new int[n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < m; j++){
               if(arr[i][j] == 0){
                    cols[j] = 1;
                    rows[i] = 1;
               }
            }
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < m; j++){
                if(rows[i] == 1 || cols[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }

      
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
