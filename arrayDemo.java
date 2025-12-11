import java.util.*;
public class arrayDemo {
    int[] arr = new int[10];
    int n;
    public void get() {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = sc.nextInt();
        System.out.println("Enter the elementsin the array:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public void display() {
        for(int i=0; i<n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    
    public void insert() {
        Scanner sc = new Scanner(System.in);
        int num, loc;
        System.out.println("Enter the element for insert:");
        num = sc.nextInt();
        System.out.println("Enter the location:");
        loc = sc.nextInt();

        for(int i=n; i>=loc; i--) {
            arr[i] = arr[i-1];
        }
        n++;
        arr[loc-1] = num;
    }

    public void delet() {
        int k,item;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position you want to delete:");
        k = sc.nextInt();
        k = k-1;
        item = arr[k];

        for(int i=k; i<n; i++) {
            arr[i] = arr[i+1];
        }
        n = n-1;
    }


    public void search() {
        Scanner sc = new Scanner(System.in);
        int ele;
        System.out.println("Enter the element you want to search:");
        ele = sc.nextInt();

        for(int i=0; i<=n; i++) {
            if(arr[i] == ele) {
                System.out.println("Element found at position: " + (i+1));
                break;
            } else if(i == n) {
                System.out.println("element is not found");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arrayDemo a = new arrayDemo();
        a.get();
        while(true) {
            System.out.println("---Menu---");
            System.out.println("1. Insert");
            System.out.println("2. delete");
            System.out.println("3. Search");
            System.out.println("4. display");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    a.insert();
                    break;
                case 2:
                    a.delet();
                    break;
                case 3:
                    a.search();
                    break;
                case 4:
                    a.display();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
