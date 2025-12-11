

public class BasicSortingAlgorithm {

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void BubbleSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void Insertion(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            int temp = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > temp) {
                arr[j] = arr[j+1];
                j++;
            }

            arr[j+1] = temp;
        }
    }

    public static void SelectioSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {8, 2, 6, 4, 10};
        // BubbleSort(arr);                                                    // BUBBLE SORT

        Insertion(arr);
        printArray(arr);
    }
}
