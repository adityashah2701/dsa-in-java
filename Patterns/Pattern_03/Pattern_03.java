package Patterns.Pattern_03;
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
public class Pattern_03 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= count; j++) {
                System.out.print("*" + " ");
            }
            count++;
            System.out.println();
        }

    }
}
