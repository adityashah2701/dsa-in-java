package Recursion.Basic;

public class Rec_5 {
    static boolean checkPalindrome(String str,int i,int n){
        if(i >= n /2 ) return true;
        if(str.charAt(i) != str.charAt(n-i-1)) return false;
        return checkPalindrome(str,i+1,n);
    }
    public static void main(String[] args) {
        String str = "madam";
        int n = str.length();
        boolean check = checkPalindrome(str,0,n);
        System.out.println(check);
    }
}
