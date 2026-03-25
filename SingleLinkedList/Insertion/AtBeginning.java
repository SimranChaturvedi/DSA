package SingleLinkedList.Insertion;

 class Node{
    int data;
    Node next;

    Node(int data){
    this.data=data;
    this.next=null;
    }

    public class AtBeginning{
        public static Node ConvertArr2LL(int[] arr){
            Node head = new Node(arr[0]);
            Node mover=head;
            for(int i=1;i<arr.length;i++){
                Node temp= new Node(arr[i]);
                mover.next = temp;
                mover = temp;
            }
            return head;
        }

        public static Node insertAtBeginning(Node head, int value){
         
            // Point new node → head
            // Move head → new node

            Node newNode = new Node(value);
            newNode.next=head;
            head=newNode;
            return head;

        }
        public static void printLL(Node head){
            Node temp= head;
            while(temp!=null){
                System.out.print(temp.data +"->");
                temp= temp.next;
            }
        }
        public static void main(String[] args) {
            int arr[] = {2, 5, 7, 9};
            Node head = ConvertArr2LL(arr);
            System.out.println("Original LL");
            printLL(head);
            head = insertAtBeginning(head, 10);
            System.out.println("After Insertion at Beginning:");
            printLL(head);
        }
    }
}