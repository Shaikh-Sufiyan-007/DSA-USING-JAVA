package BitManipulation;

public class CountSetBits {
    public static int CountSet(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) != 0)
                count++;
            
            n = n >> 1;
        }

        return count;
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(CountSet(n));
    }
}
