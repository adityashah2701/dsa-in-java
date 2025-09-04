package Patterns.Pattern_04;
//   * 
//  *** 
// ***** 
//  *** 
//   * 
public class Pattern_04 {
    public static void main(String[] args) {
            int n = 5; 
            int count = 1;
            int spaces = n / 2 ;
            for (int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j <= spaces ; j++){
                    System.out.print(" ");
                }
                for(int k = 1 ; k <= count ; k++){
                    System.out.print("*" );
                }
                if (i <= n / 2) {
                    count += 2; // Increase count for upper half
                    spaces--; // Decrease spaces for upper half
                } else {
                    count -= 2; // Decrease count for lower half
                    spaces++; // Increase spaces for lower half
                }
            System.out.println(" ");
        }
    }
}
