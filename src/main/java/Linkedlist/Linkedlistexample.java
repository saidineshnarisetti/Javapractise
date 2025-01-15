package Linkedlist;

public class Linkedlistexample {
    static class Node { // Made Node class static
        int val;
        Node next;
        
        public Node(int val) {
            this.val = val;
        }
    }

    static Node head; // Head of the linked list

    public void addNodedatend(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
   
     
    private static void printLinkedlist(Node headnode) {
    	Node current = headnode;
    	while (current!=null) {
			System.out.println(current.val);
			current=current.next;
			
		}
    	
		
	}

    public static void main(String[] args) {
        Linkedlistexample l = new Linkedlistexample();
        l.printLinkedlist(head);
        l.addNodedatend(10);
        l.addNodedatend(20);
        l.addNodedatend(30);
        l.addNodedatend(40);
    }




	
}
