package BitManipulation;

public class ClearRangeOfiBits {
    public static int RangeOfi(int n, int i, int j) {
        int a = (~0) << (j+1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(RangeOfi(n, 2, 4 ));
    }
}
