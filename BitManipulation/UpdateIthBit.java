package BitManipulation;

public class UpdateIthBit {
    public static int setIth(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIth(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIth(int n, int i, int newBit) {
        // if(newBit == 0)
        //     return clearIth(n, i);
        // else
        //     return setIth(n, i);

        n = clearIth(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(updateIth(n, 2, 1));
    }
}
