public class FriendsPairing {
    public static int f(int n) {
        if(n == 1 || n == 2) return n;
        return f(n-1) + (n-1) * f(n-2);
    }
    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
