package queueExample;

public class QueueMain {
    //Write program for Queue in Java
    public static void main(String[] args) {
        Queue queueObject = new Queue(4);
        queueObject.queueEnqueue(10);
        queueObject.queueEnqueue(30);
        queueObject.queueEnqueue(50);
        queueObject.queueEnqueue(70);
        System.out.println("Queue after Enqueue Operation:");
        queueObject.queueDisplay();
        queueObject.queueDequeue();
        queueObject.queueDequeue();
        System.out.println("\nQueue after two dequeue operations:");
        queueObject.queueDisplay();
    }
}