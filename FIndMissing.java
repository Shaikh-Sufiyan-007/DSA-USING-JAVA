public class FIndMissing {
    public static int f(int[] arr, int n) {
        for(int i=1; i<n; i++) {
            boolean found = false;
            for(int j=0; j<arr.length; j++) {
                if(arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = 5;
        System.out.println(f(arr, n));
    }
}
