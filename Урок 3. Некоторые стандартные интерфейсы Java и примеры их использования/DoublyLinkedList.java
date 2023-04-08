import java.util.Iterator;

public class DoublyLinkedList<T> implements Iterable<T> {
    
    private class Node {
        T data;
        Node next;
        Node prev;

        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    
    private Node head;
    private Node tail;
    private int size;
    
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int size() {
        return size;
    }
    
    public void add(T data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    
    public void remove(T data) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                if (currentNode.prev == null) {
                    head = currentNode.next;
                } else {
                    currentNode.prev.next = currentNode.next;
                }
                if (currentNode.next == null) {
                    tail = currentNode.prev;
                } else {
                    currentNode.next.prev = currentNode.prev;
                }
                size--;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node currentNode = head;
            
            public boolean hasNext() {
                return currentNode != null;
            }

            public T next() {
                T data = currentNode.data;
                currentNode = currentNode.next;
                return data;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
