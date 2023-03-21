package Occurances;

public class QueueClass {
	public static void main(String[] args) {
		Queue q = new Queue(4);
		q.queueEnqueue(10);
		q.queueEnqueue(30);
		q.queueEnqueue(50);
		q.queueEnqueue(70);
		System.out.println("Queue after Enqueue Operation:");
		q.queueDisplay();
		q.queueDequeue();
		q.queueDequeue();
		System.out.printf("\nQueue after two dequeue operations:");
		q.queueDisplay();
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
		}

		else {
			queue[rear] = item;
			rear++;
		}
		return;
	}

	void queueDequeue() {

		if (front == rear) {
			System.out.printf("\nQueue is empty\n");
			return;
		}

		else {
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
		int i;
		if (front == rear) {
			System.out.printf("Queue is Empty\n");
			return;
		}

		for (i = front; i < rear; i++) {
			System.out.printf(" %d , ", queue[i]);
		}
		return;
	}

}