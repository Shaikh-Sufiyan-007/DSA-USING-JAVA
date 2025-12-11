import java.util.*;
public class BasicsOpration {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();

       System.out.println(a + b);

    char char1 = 'a';
    char char2 = 'b';
    int sum = char1 + char2;
    System.out.println(sum);

    // Find Even Odd


    if(a%2 == 0) {
        System.out.println("Even");
    } else {
        System.out.println("Odd");
    }


    // Find Largest Of three Numbers

    // int a = 10;
    // int b = 20;
    // int c = 30;

    // if((a > b) && (a > c)) {
    //     System.out.println("A is greatest");
    // } else if ((b > a) && (b > c)) {
    //     System.out.println("B is greatest number");
    // } else {
    //     System.out.println("C is greatest Number");
    // }

    // System.out.println("1.Addition");
    // System.out.println("2.Substraction");
    // System.out.println("3.Multiplication");
    // System.out.println("4.Division");
    // System.out.println("Enter a option number:");

    // int number = sc.nextInt();

    // switch (number) {
    //     case 1:
    //     System.out.println("Now Enter two numbers :");
    //         int num1 = sc.nextInt();
    //         int num2 = sc.nextInt();

    //         System.out.println("Addition of these numbers is : " + (num1 + num2));
    //         break;
        
    //         case 2:
    //         System.out.println("Now Enter two numbers :");
    //         num1 = sc.nextInt();
    //         num2 = sc.nextInt();

    //         System.out.println("Substraction of these numbers is : " + (num1 - num2));
    //         break;

    //         case 3:
    //         System.out.println("Now Enter two numbers :");
    //         num1 = sc.nextInt();
    //         num2 = sc.nextInt();

    //         System.out.println("Multiplication of these numbers is : " + (num1 * num2));
    //         break;

    //         case 4:
    //         System.out.println("Now Enter two numbers :");
    //         num1 = sc.nextInt();
    //         num2 = sc.nextInt();

    //         System.out.println("Division of these numbers is : " + (num1 / num2));
    //         break;
    //     default:
    //         break;
    // }
    }
}