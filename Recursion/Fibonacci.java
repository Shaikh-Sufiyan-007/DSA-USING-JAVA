package Recursion;

public class Fibonacci {
    public static int f(int n) {
        if(n == 0 || n == 1)
            return n;
        
        int fnm1 = f(n-1);
        int fnm2 = f(n-2);
        return fnm1 + fnm2;
    }
    public static void main(String[] args) {
        int n = 25;
        System.out.println(f(n));
    }
}
