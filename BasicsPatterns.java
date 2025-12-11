public class BasicsPatterns {
    public static void main(String[] args) {
        // for(int i=0; i <=4; i++) {
        //     for(int j=0; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // for(int i=0; i<=6; i++) {
        //     for(int j=0; j<=6; j++) {
        //         if(j<=6-i) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=4; i++) {
        //     for(int j=1; j<=i ; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        char ch = 'A';
        for(int i=0; i<=4; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
