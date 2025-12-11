package Recursion;

public class SortedOrNot {
    public static boolean f(int[] arr, int i) {
        if(i == arr.length - 1)
            return true;
        
        if(arr[i] > arr[i+i])
            return false;
        
        return f(arr, i+1);
    }
    public static void main(String[] args) {
        int[] n = {1,2,3,4,2,6,7,8};
        System.out.println(f(n, 0));
    }
}
