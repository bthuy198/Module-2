package simplelinkedlist;


public class LinkedList<E> {
    private Node head;
    int numNodes;

    class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public LinkedList() {
    }

    public LinkedList(Object data) {
        this.head = new Node(data);
        numNodes++;
    }

    public void addFirst(Object data) {
        Node newNode = head;
        head = new Node(data);
        head.next = newNode;
        numNodes++;
    }

    public void add(int index, Object data) {
        if (index > numNodes) {
            System.out.println("Can't add this because index > size of list");
        }
        if (head == null) {
            addFirst(data);
            numNodes++;
        } else {
            if (index == 0) {
                addFirst(data);
            } else {
                int count = 0;
                Node currentNode = head;
                Node newNode = new Node(data);
                while (currentNode.next != null) {
                    count++;
                    if (count == index) {
                        newNode.next = currentNode.next;
                        currentNode.next = newNode;
                        break;
                    }
                    currentNode = currentNode.next;
                }
            }
            numNodes++;
        }
    }
//    public E getNode(int position) {
//        Object data = null;
//        Node getNode = null;
//        if (head == null || position < 1 || position > numNodes) {
//            return null;
//        } else {
//            if (position == 1) {
//                getFirst();
//            }
//            int count = 1;
//            Node currentNode = head;
//            while (count != position) {
//                currentNode = currentNode.next;
//                count++;
//            }
//            data = currentNode.getData();
//        }
//        return (E) data;
//    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data);
                if (temp.next != null) {
                    System.out.print(" -> ");
                } else {
                    System.out.println();
                }
                temp = temp.next;
            }
        }
    }
}
