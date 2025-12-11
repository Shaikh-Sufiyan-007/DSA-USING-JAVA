import java.util.*;
public class StackDemo {
    int max = 10;
    int[] arr = new int[max];
    int top = -1;

    public void push(int data) {
        if(top == -1) {
            System.out.println("Stack overflow");
            return;
        }

        top++;
        arr[top+1] = data;
    }

    public int pop() {
        if(top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }

        return arr[top--];
    }

    public void display() {
        if(top == -1) {
            System.out.println("Stack underflow");
            return;
        }

        while(top != -1) {
            System.out.println(pop());
        }
    }
    public static void main(String[] args) {
        
    }
}
