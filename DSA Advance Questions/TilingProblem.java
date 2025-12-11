public class TilingProblem {
    public static int f(int n) {
        if(n == 0 || n == 1) return 1;
        return f(n-1) + f(n-2);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(f(n));
    }
}
