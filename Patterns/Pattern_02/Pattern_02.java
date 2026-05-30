package Patterns.Pattern_02;
// * * * * * 1  1 2 3 4 5
// * * * * * 2. 1 2 3 4 5
// * * * * * 3. 1 2 3 4 5
// * * * * * 
// * * * * * 
public class Pattern_02 {
  public static void main(String[] args){
    int n = 5;
    for(int i = 1; i<=n ; i++){
        for(int j = 1 ; j<=n;j++){
            System.out.print("*" + " ");
        }
        System.out.println();
    } 
  }
}
