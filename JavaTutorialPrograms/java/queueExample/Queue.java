package queueExample;

public class Queue {
    private static int front, rear, capacity;
    private static int queue[];

    public Queue(int size) {
        front = rear = 0;
        capacity = size;
        queue = new int[capacity];
    }

    public void queueEnqueue(int item) {
        if (capacity == rear) {
            System.out.printf("\nQueue is full\n");
            return;
        } else {
            queue[rear] = item;
            rear++;
        }
        return;
    }

    public void queueDequeue() {
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

    public void queueDisplay() {
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