import java.util.Scanner;

public class SelectionSort {
    int[] arr = new int[10];
    int n,loc;
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
            for(int i=0; i<n-1; i++) {
                int min = arr[i];
                for(int j=i+1; j<n; j++) {
                    if(min > arr[j]) {
                        min = arr[j];
                        loc = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[loc];
                arr[loc] = temp;
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

