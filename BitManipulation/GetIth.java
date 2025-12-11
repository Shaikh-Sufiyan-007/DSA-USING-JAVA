package BitManipulation;

public class GetIth {
    public static int Ith(int n, int i) {
        int BitMast = 1 << i;
        if((n & BitMast) == 0)
            return 0;
        else
            return 1;
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(Ith(n, 3));
    }
}
