package circularqueue;

public class CircularQueue {
    Node front;
    Node rear;
    int count = 0;

    public CircularQueue() {
        this.front = null;
        this.rear = null;
    }

    class Node {
        int data;
        Node link;

        Node(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enQueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear = newNode;
            front.link = rear;
        }
        count++;
    }

    public Node deQueue() {
        Node getNode;
        if (isEmpty()) {
            return null;
        }
        if (front == rear) {
            front = rear = null;
            return null;
        } else {
            getNode = front;
            front = front.link;
            rear.link = front;
        }
        return getNode;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Circular Queue is empty");
            return;
        }
        Node temp = this.front;
        while (temp.link != this.front) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.enQueue(7);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.displayQueue();
    }
}
