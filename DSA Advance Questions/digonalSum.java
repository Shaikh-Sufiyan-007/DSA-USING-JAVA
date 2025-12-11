public class digonalSum {
    public static int printDiagonalSum(int metrix[][]) {
        int sum = 0;
        for (int i = 0; i < metrix.length; i++) {
            sum += metrix[i][i];
            if (i != metrix.length - i - 1)
                sum += metrix[i][metrix.length - i - 1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int metrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
            };
        System.out.println(metrix.length);
        System.out.println(printDiagonalSum(metrix));
    }
}
