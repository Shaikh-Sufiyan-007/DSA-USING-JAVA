package Recursion;

public class LastOcurr {
    public static int f(int[] arr, int key, int i) {
        if(i == arr.length)
            return -1;

        int isFound = f(arr, key, i+1);
        
        if(isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 5, 10, 2, 5, 3};
        System.out.println(f(arr, 5, 0));
    }
}
