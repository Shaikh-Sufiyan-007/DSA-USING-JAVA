import java.util.Scanner;

public class InsertionSort {
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
            int temp = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j++;
            }
            arr[j+1] = temp;
        }
    }

    public void display() {
        for(int i=0; i<n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();
        s.get();
        s.sort();
        s.display();
    }
}
