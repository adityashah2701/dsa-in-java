package Patterns.Pattern_05;
// **** **** 
// ***   *** 
// **     ** 
// *       * 
// **     ** 
// ***   *** 
// **** **** 
public class Pattern_05 {
    public static void main(String[] args) {
            int n = 7; 
            int space = 1;
            int count = n / 2 + 1 ;
            for (int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j <= count ; j++){
                    System.out.print("*");
                }
                for(int k = 1 ; k <= space ; k++){
                    System.out.print(" " );
                }
                  for(int j = 1 ; j <= count ; j++){
                    System.out.print("*");
                }
                if (i < n / 2 + 1) {
                    space += 2; // Increase space for upper half
                    count--; // Decrease count for upper half
                } else {
                    space -= 2; // Decrease space for lower half
                    count++; // Increase count for lower half
                }
            System.out.println(" ");
        }
    }
}
