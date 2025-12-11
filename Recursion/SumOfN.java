package Recursion;

public class SumOfN {
    public static int f(int n) {
        int sum = 0;
        if(n == 1)
            return 1;
        
        sum = n + f(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(f(n));
        // int sum = 0;
        // for(int i=0; i<=n; i++) {
        //     sum += i;
        // }
        // System.out.println(sum);
    }
}
