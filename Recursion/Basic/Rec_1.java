package Recursion.Basic;

public class Rec_1 {
    private static void recursive_name(int i, int n) {
        if (i > n)
            return;
        System.out.println(i + ": Aditya");
        recursive_name(i + 1, n);
    }

    public static void main(String[] args) {
        int n = 5;
        recursive_name(1, n);

    }
}
