public class Gridways {
    public static int f(int i, int j, int n, int m) {
        if(i == n-1 && j == m-1) {
            return 1;
        } else if(i == n || j == n) {
            return 0;
        }

        int w1 = f(i+1, j, n, m);
        int w2 = f(i, j+1, n, m);
        return w1 + w2;
    }
    public static void main(String[] args) {
        int m =3 , n = 3;
        System.out.println(f(0, 0, n, m));
    }
}
