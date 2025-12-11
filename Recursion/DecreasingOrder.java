package Recursion;

public class DecreasingOrder {
    public static void Print(int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }
        Print(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        Print(n);
    }
}
