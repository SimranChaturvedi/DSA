package SingleLinkedList.Insertion;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AtEnd {
    // Traverse till last node
    // Attach new node

    public static Node convert2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node insertAtEnd(Node head, int value) {
        Node newnode = new Node(value);
        if (head == null) {
            return newnode;
        }
        Node temp = head;

        while (temp.next != null) {
             temp = temp.next;
        }
        temp.next = newnode;
        return head;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 7, 19 };
        Node head = convert2LL(arr);
        System.out.println("Original List");
        display(head);
        System.out.println();
        System.out.println("Insertion at end");
        head = insertAtEnd(head, 23);
        display(head);
    }
}
