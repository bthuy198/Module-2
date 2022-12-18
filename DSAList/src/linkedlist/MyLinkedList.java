package linkedlist;

public class MyLinkedList<E> {
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

    public MyLinkedList() {
    }

    public MyLinkedList(Object data) {
        this.head = new Node(data);
        numNodes++;
    }

    public int size() {
        return this.numNodes;
    }

    public int indexOf(Object data) {
        int count = 0;
        int index = -1;
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.getData().equals(data)) {
                index = count;
            }
            currentNode = currentNode.next;
            count++;
        }
        return index;
    }

    public boolean contains(Object data) {
        boolean isContain = false;
        int count = 0;
        Node currentNode = head;
        while (count < numNodes - 1) {
            if (currentNode.getData().equals(data)) {
                isContain = true;
            }
            currentNode = currentNode.next;
            count++;
        }
        return isContain;
    }
    public void addFirst(Object data) {
        Node newNode = head;
        head = new Node(data);
        head.next = newNode;
        numNodes++;
    }

    public void addLast(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
            numNodes++;
        }
    }

    public void add(int position, Object data) {
        if (position > numNodes) {
            System.out.println("Can't add this because index > numbers of nodes");
        } else {
            if (position == 1) {
                addFirst(data);
            } else {
                Node newNode = new Node(data);
                int count = 1;
                Node currentNode = head;
                while (currentNode.next != null) {
                    count++;
                    if (count == position) {
                        newNode.next = currentNode.next;
                        currentNode.next = newNode;
                        break;
                    }
                    currentNode = currentNode.next;
                }
                numNodes++;
            }
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            numNodes--;
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node preNode = null;
            Node lastNode = head;
            while (lastNode.next != null) {
                preNode = lastNode;
                lastNode = lastNode.next;
            }
            if (preNode == null) {
                removeFirst();
            } else {
                preNode.next = null;
                numNodes--;
            }
        }
    }

    public void remove(int position) {
        if (head == null || position < 1 || position > numNodes) {
            System.out.println("Can't found value in this position");
        }
        if (position == 1) {
            removeFirst();
            numNodes--;
        } else {
            int count = 1;
            Node currentNode = head;
            Node preNode = null;
            while (currentNode != null) {
                if (count == position) {
                    break;
                }
                preNode = currentNode;
                currentNode = currentNode.next;
                count++;
            }
            preNode.next = currentNode.next;
            numNodes--;
        }
    }

    public boolean removeObj(Object data) {

        return false;
    }

    public E getFirst() {
        Object data;
        if (head == null) {
            System.out.println("List is empty");
            return null;
        } else {
            return (E) this.head.getData();
        }
    }

    public E getLast() {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        } else {
            Node currentNode = null;
            Node lastNode = head;
            while (lastNode != null) {
                currentNode = lastNode;
                lastNode = lastNode.next;
            }
            return (E) currentNode.getData();
        }
    }

    public E getNode(int position) {
        Object data = null;
        Node getNode = null;
        if (head == null || position < 1 || position > numNodes) {
            return null;
        } else {
            if (position == 1) {
                getFirst();
            }
            int count = 1;
            Node currentNode = head;
            while (count != position) {
                currentNode = currentNode.next;
                count++;
            }
            data = currentNode.getData();
        }
        return (E) data;
    }

    public MyLinkedList clone() {
        MyLinkedList clone = new MyLinkedList();
        clone.head = this.head;
        clone.numNodes = this.numNodes;
        return clone;
    }

    public void clear() {
        this.head = null;
        this.numNodes = 0;
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("LinkedList is empty");
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
