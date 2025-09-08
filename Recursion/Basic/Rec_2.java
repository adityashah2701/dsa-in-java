package Recursion.Basic;

public class Rec_2 {

    public static void sumOfNumbers(int n , int sum){
        if(n < 1) {
            System.out.println("Sum of numbers :- " + sum);
            return;
        }
        sumOfNumbers(n-1,sum+n);
    }
    public static void main(String[] args) {
        int n = 9;
        
        sumOfNumbers(n,0);
    }
}
