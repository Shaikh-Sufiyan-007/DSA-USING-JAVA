import java.util.Scanner;

public class BubbleSort {
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

    public void sort() {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void display() {
        for(int i=0; i<n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        b.get();
        b.sort();
        b.display();
    }
}
