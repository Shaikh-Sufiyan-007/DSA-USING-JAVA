package BitManipulation;

public class ClearLastiBits {
    public static int Lasti(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(Lasti(n, 2));
    }
}
