package queueExample;
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