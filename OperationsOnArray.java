import java.util.*;

import javax.swing.JSpinner.NumberEditor;
public class OperationsOnArray {

    public static int LinearSearch(int Number[] , int key) {
        for(int i = 0; i<Number.length; i++) {
            if(Number[i] == key) {
                return i;
            } 
        }
        return -1;
    }

    public static int largestNum(int Number[]) {
        int large = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<Number.length; i++) {
            if(large < Number[i]) {
                large = Number[i];
            }
            if(smallest > Number[i]) {
                smallest = Number[i];
            }
        }
        System.out.println("Smallest Value is :" + smallest);
        return large;
    }

    public static int BinarySearch(int arr[] , int key) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] == key) {
                return mid;
            }
            
            if(arr[mid] < key) {
                 start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
            
        return -1;
    }

    public static void ReverseArray(int Number[]) {
        int first = 0, last = Number.length - 1;

        while(first < last) {
            int temp = Number[last];
            Number[first] = Number[last];
            temp = Number[first];

            first++;
            last--;
        }
    }

    public static void printPairs(int Number[]) {
        for(int i=0; i<Number.length; i++) {
            int curr = Number[i];
            for(int j=i + 1; j<Number.length; j++) {
                System.out.print("(" + curr + " ," + Number[j] + " )");
            }
            System.out.println();
        }
    }

    public static void printSubArray(int Number[]) {
        for(int i=0; i<Number.length; i++) {
            int start = i;
            for(int j=i; j<Number.length; j++) {
                int end = j;
                for(int k=start; k<=end; k++) {
                    System.out.print(Number[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void MaxSubArraySumBruteForce(int Number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;


        for(int i=0; i<Number.length; i++) {
            int start = i;
            for(int j=i; j<Number.length; j++) {
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++) {
                    currSum += Number[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum is = " + maxSum);
    }

    public static void MaxSubArraySumPrefixSum(int Number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[Number.length];

        prefix[0] = Number[0];

        for(int i = 1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + Number[i];
        }

        for(int i = 0; i<Number.length; i++) {
            int start = i;
            for(int j=i; j<Number.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start -1];

                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum is = " + maxSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // int marks[] = new int[50];
        // marks[0] = 25;
        // marks[1] = 30;
        // marks[2] = 50;

        // System.out.println(marks[1]);

        // LINEAR SEARCH:=>                                     // IMPORTANT

        // int Number[] = {1,2,3,4,5,10,6,7,8,9,};
        // int key = 1;

        // int index = LinearSearch(Number  , key);
        // System.out.println("The key is at " + index + " position");

        // LARGEST NUMBER IN ARRAY :=>

        // int arr[] = {2,4,6,23,45,2,1,5,8};
        // int Large = largestNum(arr);
        // System.out.println("Largest value is :" + Large);


        // BINARY SEARCH :=>                                            // IMPORTANT

        // int arr[] = {2,4,6,8,10,12,14,16};
        // int key = 12;
        // int index = BinarySearch(arr , key);
        // System.out.println("Position of key is :" + index);

        // REVERSE AN ARRAY:=>

        // int Number[] = {2,4,6,8,10};
        // ReverseArray(Number);
        // for(int i =0; i<=Number.length; i++) {
        //     System.out.print(Number[i] + " ");
        // }
        // System.out.println();

        //  PAIRS OF NUMBERS IN AN ARRAY :=> 

        // int Numbers[] = {2, 4, 6, 8, 10};
        // printPairs(Numbers);


        //  PRINT SUBARRAY :=>

        // int Number[] = {2, 4, 6, 8, 10};
        // printSubArray(Number);

        // CALCULATE MAXIMAUM OF SUBARRAY :=>                                            Brute Force(Basic Solution)

        int Number[] = {1, -2, 6, -1, 3};
        // MaxSubArraySumBruteForce(Number);

        MaxSubArraySumPrefixSum(Number);                                                   // Prefix algotithm
    }
}
