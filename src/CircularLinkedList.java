public class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        head = null;
        tail = null;
    }

    public void add(int v) {
        Node add = new Node(v);

        if (head == null) {   // if list is empty
            head = add;
            tail = add;
            add.next = head;
        } else {
            add.next = head;
            tail.next = add;
            tail = add;
        }
    }

    public void removeNode(int v) {
        Node curr = head;
        Node prev = curr;

        while (curr.data != v) {    // finds where the selected node is
            prev = curr;
            curr = curr.next;
        }

        if (curr == head) {
            prev = tail;
        } else if (curr == tail) {
            tail = prev;
            head = curr.next;
        }
        prev.next = curr.next;
    }

    public void print() {
        if (head == null) System.out.println("List is empty");

        Node itr = head.next;

        System.out.print(head.data + " ");

        while (itr != head) {
            System.out.print(itr.data + " ");
            itr = itr.next;
        }

        System.out.println();
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
