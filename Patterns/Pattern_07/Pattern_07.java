package Patterns.Pattern_07;

public class Pattern_07 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        int spaces = n / 2;

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // calculate starting number
            int num = i <= n / 2 + 1 ? i : n - i + 1;

            // print increasing numbers
            int val = num;
            for (int k = 1; k <= count / 2 + 1; k++) {
                System.out.print(val);
                val++;
            }

            // print decreasing numbers
            val -= 2;
            for (int k = 1; k <= count / 2; k++) {
                System.out.print(val);
                val--;
            }

            // update count and spaces
            if (i <= n / 2) {
                count += 2;
                spaces--;
            } else {
                count -= 2;
                spaces++;
            }

            System.out.println();
        }
    }
}
