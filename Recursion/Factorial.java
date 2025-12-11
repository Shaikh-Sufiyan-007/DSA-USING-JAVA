package Recursion;

public class Factorial {
    public static int f(int n) {
        if(n == 0)
            return 1;
        
        int fn = n * f(n - 1);
        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(f(n));


        // int sum = 1;
        // for(int i=1; i<=n; i++) {
        //     sum = sum * i;
        // }
        // System.out.println(sum);
    }
}
