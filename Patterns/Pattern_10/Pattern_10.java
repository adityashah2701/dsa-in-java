package Patterns.Pattern_10;

public class Pattern_10 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n * 2 - 1; i++) {
            for (int j = 0; j < n * 2 - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;

                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
    }
}
