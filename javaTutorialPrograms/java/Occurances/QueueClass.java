package Occurances;
public class QueueClass {
    //Write program for Queue in Java
    public static void main(String[] args) {
        Queue queueobj = new Queue(4);
        queueobj.queueEnqueue(10);
        queueobj.queueEnqueue(30);
        queueobj.queueEnqueue(50);
        queueobj.queueEnqueue(70);
        System.out.println("Queue after Enqueue Operation:");
        queueobj.queueDisplay();
        queueobj.queueDequeue();
        queueobj.queueDequeue();
        System.out.println("\nQueue after two dequeue operations:");
        queueobj.queueDisplay();
    }
}

class Queue {
    private static int front, rear, capacity;
    private static int queue[];

    Queue(int size) {
        front = rear = 0;
        capacity = size;
        queue = new int[capacity];
    }

    void queueEnqueue(int item) {
        if (capacity == rear) {
            System.out.printf("\nQueue is full\n");
            return;
        } else {
            queue[rear] = item;
            rear++;
        }
        return;
    }

    void queueDequeue() {
        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return;
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if (rear < capacity)
                queue[rear] = 0;
            rear--;
        }
        return;
    }

    void queueDisplay() {
        int variable;
        if (front == rear) {
            System.out.printf("Queue is Empty\n");
            return;
        }
        for (variable = front; variable < rear; variable++) {
            System.out.printf(" %d , ", queue[variable]);
        }
        return;
    }
}