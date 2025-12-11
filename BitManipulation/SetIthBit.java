package BitManipulation;

public class SetIthBit {
    public static int setIth(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        int n = 10, i = 2;
        System.out.println(setIth(n, i));
    }
}
