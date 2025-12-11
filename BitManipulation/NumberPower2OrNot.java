package BitManipulation;

public class NumberPower2OrNot {
    public static boolean PowerOf2(int n) {
        return ((n & (n-1)) == 0);
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(PowerOf2(n));
    }
}
