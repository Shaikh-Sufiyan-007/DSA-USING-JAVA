import java.util.*;

public class JavaFunctions {
    public static int Sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static int Factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int Bionomial(int n, int r) {
        int bio_n = Factorial(n);
        int bio_r = Factorial(r);
        int bio_nmr = Factorial(n - r);

        int Total_bionomial = bio_n / (bio_r * bio_nmr);
        return Total_bionomial;
    }

    public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n) {
        for(int i = 2; i<=n; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void BinaryToDecimal(int binNum) {
        int myNum = binNum;
        int power = 0;
        int decNum = 0;

        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, power));

            power++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of " + myNum + " = " + decNum);
    }

    public static void DecimalToBinary(int DecNum) {
        int power = 0;
        int binNum = 0;
        int myNum = DecNum;

        while (DecNum > 0) {
            int rem = DecNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, power));
            power++;
            DecNum = DecNum/2;
        }
        System.out.println("Binary form of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("Sum is :" + Sum(a, b));

        // CALL BY VALUE
        // int a = 5;
        // int b = 10;
        // swap(a , b);
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);

        // FACTORIAL

        // int n = sc.nextInt();
        // System.out.println(Factorial(n));

        // BIONOMIAL COEFFICIENT :=

        // System.out.println(Bionomial(5 , 2));

        // CALCULATE PRIME NUMBER :=

        // int n = sc.nextInt();
        // boolean isPrime = true;

        // if (n == 2) {
        //     System.out.println("n is prime number");
        // } else {
        //     for (int i = 2; i <= Math.sqrt(n); i++) {
        //         if (n % i == 0) {
        //             isPrime = false;
        //         }
        //     }
        //     if (isPrime == true) {
        //         System.out.println("Number is Prime");
        //     } else {
        //         System.out.println("Number is not prime");
        //     }
        // }

        // CALCULATE OPTIMIZED PRIME NUMBER :=

        // System.out.println(isPrime(7));

        // CALCULATE ALL PRIME NUMBER IN THE RANGE

        // primesInRange(1000);

        // CONVERT BINARY TO DECIMAL

        // BinaryToDecimal(101);

        // CONVERT DECIMAL TO BINARY

        DecimalToBinary(8);
    }
}
