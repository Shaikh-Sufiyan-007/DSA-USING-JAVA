package Recursion;

public class PrintXPowerN {
    public static int f(int x, int n) {
        if(n == 0) return 1;
        return x * f(x, n-1);
    }

    public static int optimizePower(int x, int n) {
        if(n == 0) return 1;

        int halfPower = optimizePower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n % 2 != 0)
            halfPowerSq = x * halfPowerSq;

        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 2, n = 10;
        System.out.println(optimizePower(x, n));
    }
}
