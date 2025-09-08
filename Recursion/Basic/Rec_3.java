package Recursion.Basic;

public class Rec_3 {
    public static void factorial(int n , int fact){
        if(n == 0) {
            System.out.println("Factorial:- " + fact);
            return;
        }
        factorial(n-1,fact*n);
    }
    public static void main(String[] args) {
        int n = 5;
        factorial(n , 1);
    }
}
