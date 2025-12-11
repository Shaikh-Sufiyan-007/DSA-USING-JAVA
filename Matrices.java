import java.util.Scanner;
public class Matrices {
    int[][] a = new int[10][10];
    int[][] b = new int[10][10];
    int[][] d = new int[10][10];
    int r,c,i,j,k;

    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        c = sc.nextInt();

        System.out.println("Enter the first matrix element:");
        for(i=0; i<r; i++) {
            for(j=0; j<c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the second matrix element:");
        for(i=0; i<r; i++) {
            for(j=0; j<c; j++) {
                b[i][j] = sc.nextInt();
            }
        }
    }

    public void addition() {
        System.out.println("Addition of two matrices are :");
        for(i=0; i<r; i++) {
            for(j=0; j<c; j++) {
                d[i][j] = a[i][j] + b[i][j];
            }
        }

        for(i=0; i<r; i++) {
            for(j=0; j<c; j++) {
                System.out.print(d[i][j] + "");
            }
            System.err.println();
        }
    }
    public void substraction() {
        System.out.println("Substraction of two matrices are :");
        for(i=0; i<r; i++) {
            for(j=0; j<c; j++) {
                d[i][j] = a[i][j] - b[i][j];
            }
        }

        for(i=0; i<r; i++) {
            for(j=0; j<c; j++) {
                System.out.print(d[i][j] + "");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrices m = new Matrices();
        m.get();
        while(true) {
            System.out.println("---Menu---");
            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Exit");
            System.out.println("Enter you choice :");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    m.addition();
                    break;
                case 2:
                    m.substraction();
                    break;
                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
