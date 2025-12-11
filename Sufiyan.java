import java.util.*;

public class Sufiyan {
    int size;
    int[] que;
    int front;
    int rear;

    public Sufiyan(int size) {
        this.size = size;
        front = rear = -1;
        que = new int[size];
    }

    public void enque(int data) {
        if(rear == size-1) {
            System.out.println("Queue is full");
        } else {
            if(front == -1) {
                front = 0;
            }
            rear++;
            que[rear] = data;
        }
    }

        public int deque() {
            if(front == -1) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                int data = que[front++];
                if(front > rear) {
                    front = rear = -1;
                }
                System.out.println("Deleted item is  :" + data);
                return data;
            }
        }

    public void display() {
        if(front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        for(int i=front; i<=rear; i++) {
            System.out.print(que[i] + " ");
        }
    }



    public static void main(String[] args) {
        Sufiyan obj = new Sufiyan(10);
        obj.enque(1);
        obj.enque(2);
        obj.enque(3);
        obj.enque(4);
        obj.enque(5);
        obj.display();
        obj.deque();
        obj.display();
    }
}
