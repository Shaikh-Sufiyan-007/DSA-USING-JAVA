import java.util.*;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int counter = sc.nextInt();
        // int number = 1;
        // int sum = 0;
        // while(number <=counter) {
        //     sum = sum + number;
        //     number++;
        // }
        // System.out.println("Sum of these numatural number is : " + sum);

        // Print Square Star Patter

        // for(int i=0; i<=4; i++) {
        //     System.out.println("****");
        // }


        // PRINT REVERSE OF A NUMBER

        int n = 10899;

        for(int i = 0; i <=4 ; i++) {
            int LastDigit = n % 10;
            System.out.print(" " + LastDigit);
            n = n / 10;
        }
    }
}
