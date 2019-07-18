public class DoubleLinkedList {
	Node head;
	void append(int data) {
		Node new_node = new Node(data);
		Node last = head;
		new_node.next = null;
		if(head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}
		else {
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;
			new_node.prev = last;
		}
	}
	void push(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		new_node.prev = null;
		 if(head != null) {
			 head.prev = new_node;
		 }
		 head = new_node;
	}
	void print(Node node) {
		Node last = null; 
        System.out.println("forward Direction"); 
        while (node != null) { 
            System.out.print(node.data + " "); 
            last = node; 
            node = node.next; 
        } 
        System.out.println(); 
        System.out.println("reverse direction"); 
        while (last != null) { 
            System.out.print(last.data + " "); 
            last = last.prev; 
        } 
	}
}
